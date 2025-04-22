Feature: Buscar citas por peluquero
  Como administrador
  Quiero poder ver todas las citas de un peluquero específico
  Para gestionar su agenda de trabajo

  Scenario: Obtener citas existentes de un peluquero
    Given Existe un peluquero registrado "Juan" con teléfono "987654321"
    And Existe una cita para "Ana" con "Juan" el "2025-04-15" a las "10:00"
    And Existe una cita para "Carlos" con "Juan" el "2025-04-15" a las "12:00"
    When Busco las citas del peluquero "Juan"
    Then Debo obtener 2 citas
    And La primera cita debe ser para "Ana"