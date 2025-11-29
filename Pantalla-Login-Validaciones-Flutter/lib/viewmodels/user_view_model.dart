// Autor: Gabriel Frank Krisna Zela Flores
// Fecha de creación: 28/11/2025
// Última actualización: 28/11/2025

import 'package:flutter/material.dart';
import '../models/user.dart';

class UserViewModel extends ChangeNotifier {
  final List<User> _usuarios = [];

  List<User> get usuarios => _usuarios;

  void agregarUsuario(User usuario) {
    _usuarios.add(usuario);
    notifyListeners();
  }

  void editarUsuario(int index, User usuario) {
    _usuarios[index] = usuario;
    notifyListeners();
  }

  void eliminarUsuario(int index) {
    _usuarios.removeAt(index);
    notifyListeners();
  }
}
