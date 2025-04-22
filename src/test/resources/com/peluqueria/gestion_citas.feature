Feature: Gestión de Citas
  Como administrador
  Quiero poder gestionar citas
  Para organizar el trabajo de los peluqueros

  Scenario: Añadir una cita exitosamente
    Given Un cliente registrado "Ana" con teléfono "12356789"
    And Un peluquero registrado "Juan" con teléfono "987654321"
    When Añado una cita para "Ana" con "Juan" el "2025-04-15" a las "10:00"
    Then La cita se añade correctamente
    And El sistema muestra 1 cita para el día "2025-04-15"