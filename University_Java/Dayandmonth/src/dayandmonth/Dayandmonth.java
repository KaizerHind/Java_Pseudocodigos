package dayandmonth;

import java.util.Scanner;

public class Dayandmonth {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double dia;
        double impares;
        double mes;
        double pares;
        double tmes;
        double ttotal;
        pares = 0;
        impares = 0;
        System.out.println("Digite el mes:");
        mes = entrada.nextInt();
        if ((mes != 0) && (mes <= 12)) {
            if (mes == 1) {
                System.out.println("Digite el dia:");
                dia = entrada.nextInt();
                if ((dia != 0) && (dia <= 31)) {
                    System.out.println("El monto de dias con mes " + mes + " y dia " + dia + " es de " + dia);
                } else {
                    System.out.println("El valor del dia debe de ser entre 1 y 31, ambos incluidos");
                }
            } else {
                if (mes == 2) {
                    System.out.println("Digite el dia:");
                    dia = entrada.nextInt();
                    if ((dia != 0) && (dia <= 31)) {
                        tmes = 31;
                        ttotal = tmes + dia;
                        System.out.println("El monto de dias con mes " + mes + " y dia " + dia + " es de " + ttotal);
                    } else {
                        System.out.println("El valor del dia debe de ser entre 1 y 31, ambos incluidos");
                    }
                } else {
                    if (mes == 3) {
                        System.out.println("Digite el dia:");
                        dia = entrada.nextInt();
                        if ((dia != 0) && (dia <= 31)) {
                            tmes = 31 + 28;
                            System.out.println("tmes" + tmes);
                            ttotal = tmes + dia;
                            System.out.println("El monto de dias con mes " + mes + " y dia " + dia + " es de " + ttotal);
                        } else {
                            System.out.println("El valor del dia debe de ser entre 1 y 31, ambos incluidos");
                        }
                    } else {
                        if (mes == 4) {
                            System.out.println("Digite el dia:");
                            dia = entrada.nextInt();
                            if ((dia != 0) && (dia <= 31)) {
                                tmes = 2 * 31 + 28;
                                ttotal = tmes + dia;
                                System.out.println("El monto de dias con mes " + mes + " y dia " + dia + " es de " + ttotal);
                            } else {
                                System.out.println("El valor del dia debe de ser entre 1 y 31, ambos incluidos");
                            }
                        } else {
                            if (mes == 5) {
                                System.out.println("Digite el dia:");
                                dia = entrada.nextInt();
                                if ((dia != 0) && (dia <= 31)) {
                                    tmes = 2 * 31 + 30 + 28;
                                    ttotal = tmes + dia;
                                    System.out.println("El monto de dias con mes " + mes + " y dia " + dia + " es de " + ttotal);
                                } else {
                                    System.out.println("El valor del dia debe de ser entre 1 y 31, ambos incluidos");
                                }
                            } else {
                                if (mes == 6) {
                                    System.out.println("Digite el dia:");
                                    dia = entrada.nextInt();
                                    if ((dia != 0) && (dia <= 31)) {
                                        tmes = 3 * 31 + 30 + 28;
                                        ttotal = tmes + dia;
                                        System.out.println("El monto de dias con mes " + mes + " y dia " + dia + " es de " + ttotal);
                                    } else {
                                        System.out.println("El valor del dia debe de ser entre 1 y 31, ambos incluidos");
                                    }
                                } else {
                                    if (mes == 7) {
                                        System.out.println("Digite el dia:");
                                        dia = entrada.nextInt();
                                        if ((dia != 0) && (dia <= 31)) {
                                            tmes = 3 * 31 + 2 * 30 + 28;
                                            ttotal = tmes + dia;
                                            System.out.println("El monto de dias con mes " + mes + " y dia " + dia + " es de " + ttotal);
                                        } else {
                                            System.out.println("El valor del dia debe de ser entre 1 y 31, ambos incluidos");
                                        }
                                    } else {
                                        if (mes == 8) {
                                            System.out.println("Digite el dia:");
                                            dia = entrada.nextInt();
                                            if ((dia != 0) && (dia <= 31)) {
                                                tmes = 4 * 31 + 2 * 30 + 28;
                                                ttotal = tmes + dia;
                                                System.out.println("El monto de dias con mes " + mes + " y dia " + dia + " es de " + ttotal);
                                            } else {
                                                System.out.println("El valor del dia debe de ser entre 1 y 31, ambos incluidos");
                                            }
                                        } else {
                                            if (mes == 9) {
                                                System.out.println("Digite el dia:");
                                                dia = entrada.nextInt();
                                                if ((dia != 0) && (dia <= 31)) {
                                                    tmes = 4 * 31 + 3 * 30 + 28;
                                                    ttotal = tmes + dia;
                                                    System.out.println("El monto de dias con mes " + mes + " y dia " + dia + " es de " + ttotal);
                                                } else {
                                                    System.out.println("El valor del dia debe de ser entre 1 y 31, ambos incluidos");
                                                }
                                            } else {
                                                if (mes == 10) {
                                                    System.out.println("Digite el dia:");
                                                    dia = entrada.nextInt();
                                                    if ((dia != 0) && (dia <= 31)) {
                                                        tmes = 5 * 31 + 3 * 30 + 28;
                                                        ttotal = tmes + dia;
                                                        System.out.println("El monto de dias con mes " + mes + " y dia " + dia + " es de " + ttotal);
                                                    } else {
                                                        System.out.println("El valor del dia debe de ser entre 1 y 31, ambos incluidos");
                                                    }
                                                } else {
                                                    if (mes == 11) {
                                                        System.out.println("Digite el dia:");
                                                        dia = entrada.nextInt();
                                                        if ((dia != 0) && (dia <= 31)) {
                                                            tmes = 5 * 31 + 4 * 30 + 28;
                                                            ttotal = tmes + dia;
                                                            System.out.println("El monto de dias con mes " + mes + " y dia " + dia + " es de " + ttotal);
                                                        } else {
                                                            System.out.println("El valor del dia debe de ser entre 1 y 31, ambos incluidos");
                                                        }
                                                    } else {
                                                        if (mes == 12) {
                                                            System.out.println("Digite el dia:");
                                                            dia = entrada.nextInt();
                                                            if ((dia != 0) && (dia <= 31)) {
                                                                tmes = 6 * 31 + 4 * 30 + 28;
                                                                ttotal = tmes + dia;
                                                                System.out.println("El monto de dias con mes " + mes + " y dia " + dia + " es de " + ttotal);
                                                            } else {
                                                                System.out.println("El valor del dia debe de ser entre 1 y 31, ambos incluidos");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            System.out.println("El valor del mes debe de ser entre 1 y 12, ambos incluidos");
        }
    }
}
