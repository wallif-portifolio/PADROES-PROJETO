package Documentos;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("PASSO A: CRIANDO TEMPLATE\n");

        List<Questao> questoesTemplate = Arrays.asList(
                new Questao("Q1", "Pergunta 1", 3),
                new Questao("Q2", "Pergunta 2", 3),
                new Questao("Q3", "Pergunta 3", 4)
        );

        Prova template = new Prova(
                "Prova SQL - Template",
                "TEMPLATE",
                "2026-03-10",
                "BASE",
                questoesTemplate
        );

        template.printResumo();

        System.out.println("PASSO B: GERANDO PROVAS CLONADAS\n");

        Prova prova1 = template.copiar();
        prova1 = new Prova(
                template.getTitulo(),
                "2° INFO A",
                "2026-03-20",
                "V1",
                prova1.getQuestoes()
        );

        Questao novaQ2 = new Questao("Q2", "Pergunta 2 modificada", 3);
        prova1.substituirQuestao("Q2", novaQ2);

        System.out.println("PROVA 1 - TURMA A:");
        prova1.printResumo();

        Prova prova2 = template.copiar();
        prova2 = new Prova(
                template.getTitulo(),
                "2° INFO B",
                "2026-03-21",
                "V1",
                prova2.getQuestoes()
        );

        Questao q3Modificada = new Questao("Q3", "Pergunta 3 modificada", 5);
        prova2.substituirQuestao("Q3", q3Modificada);

        System.out.println("PROVA 2 - TURMA B:");
        prova2.printResumo();

        System.out.println("TESTE: VERIFICANDO CÓPIA PROFUNDA\n");

        System.out.println("Modificando Q1 da Prova 1...\n");
        Questao q1Modificada = new Questao("Q1", "Pergunta 1 modificada", 5);
        prova1.substituirQuestao("Q1", q1Modificada);

        System.out.println("TEMPLATE ORIGINAL (deve estar intacto):");
        template.printResumo();

        System.out.println("PROVA 1 APÓS MODIFICAÇÃO:");
        prova1.printResumo();

        System.out.println("=== RESULTADO ===");
        System.out.println("Se o template NÃO mudou, a cópia profunda funcionou.");
        System.out.println("Se o template mudou, você fez cópia rasa (errado).");
    }
}