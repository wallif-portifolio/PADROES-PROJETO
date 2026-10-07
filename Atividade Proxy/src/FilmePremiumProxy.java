public class FilmePremiumProxy implements Conteudo {
    private FilmePremium filmePremium;

    @Override
    public void assistir(Usuario usuario) {
        if (usuario == null) {
            throw new IllegalArgumentException("Usuário inválido.");
        }

        if (usuario.getPlano().equals(Usuario.PLANO_PREMIUM)) {
            System.out.println("Acesso liberado para " + usuario.getNome() + ".");

            if (filmePremium == null) {
                filmePremium = new FilmePremium();
            }

            filmePremium.assistir(usuario);
        }
        else if (usuario.getPlano().equals(Usuario.PLANO_BASICO)) {
            System.out.println("Acesso negado para " + usuario.getNome() + ". Plano BÁSICO não permite acesso a conteúdos premium.");
        }
        else {
            System.out.println("Plano inválido para o usuário " + usuario.getNome() + ".");
        }
    }
}