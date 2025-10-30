var winston = require('winston');
const env = process.env.NODE_ENV;
const logDir = 'logs';
const fs = require('fs');

if (!fs.existsSync(logDir)) {
    fs.mkdirSync(logDir);
}

const now = new Date();
var logger = new(winston.Logger)({
    transports: [
        new winston.transports.Console({ 
            level: 'info',
            timestamp: true,
            colorize: true
        }),
        new winston.transports.File({
            name: 'error-file',
            filename: './logs/exceptions.log',
            level: 'error',
            json: false,
            timestamp: true
        }),
        new winston.transports.File({
            name: 'information-file',
            filename: './logs/users-api.log',
            level: env === 'development' ? 'debug' : 'info',
            json: false,
            timestamp: true,
            maxsize: 5242880, // 5MB
            maxFiles: 5
        })
    ],
    exitOnError: false
});

module.exports = logger;
module.exports.stream = {
    write: function(message, encoding) {
        logger.info(message);
        console.log('message=', message);
    }
};