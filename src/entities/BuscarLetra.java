package entities;

public class BuscarLetra {

    // Construtor padrão
    public BuscarLetra() {
    }

    public int contarLetra(String str) {
        int count = 0;

        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'A') {
                count++;
            }
        }
        return count;
    }

}
