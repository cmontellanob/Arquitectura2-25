const mongoose = require('mongoose');
mongoose.connect('mongodb://localhost:27017/bd_usuarios' )
  .then(() => console.log('Conectado a MongoDB'))
  .catch(error => console.error('Error al conectar a MongoDB:', error));
