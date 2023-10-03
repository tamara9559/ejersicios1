enum games {
    DEPORTIVOS("FIFA20","nose",1980){
        @Override
        public String mostrarPosicionRanking() {
            return "hola";
        }

        @Override
        public String comprarMonedas() {
            return "adios";
        }
    } ,
    ESTRATEGIA("clash royale","nose",1990){
        @Override
        public String mostrarPosicionRanking() {
            return "hola";
        }

        @Override
        public String comprarMonedas() {
            return "adios";
        }
    },
    MUSICALES("guitar hero","nose",1999){
        @Override
        public String mostrarPosicionRanking() {
            return "hola";
        }

        @Override
        public String comprarMonedas() {
            return "adios";
        }
    },
    AVENTURAS("blasphemous","nose",1998){
        @Override
        public String mostrarPosicionRanking() {
            return "hola";
        }

        @Override
        public String comprarMonedas() {
            return "adios";
        }
    },
    SIMULACION("warzone","nose",1995){
        @Override
        public String mostrarPosicionRanking() {
            return "hola";
        }

        @Override
        public String comprarMonedas() {
            return "adios";
        }
    };
    private String nombreVideojuego;
    private String comoJuega;
    private int añoCreacion;

    games(String nombreVideojuego, String comoJuega, int añoCreacion) {
        this.nombreVideojuego = nombreVideojuego;
        this.comoJuega = comoJuega;
        this.añoCreacion = añoCreacion;
    }

    public String getNombreVideojuego() {
        return nombreVideojuego;
    }

    public String getComoJuega() {
        return comoJuega;
    }

    public int getAñoCreacion() {
        return añoCreacion;
    }

    public void setNombreVideojuego(String nombreVideojuego) {
        this.nombreVideojuego = nombreVideojuego;
    }

    public void setComoJuega(String comoJuega) {
        this.comoJuega = comoJuega;
    }

    public void setAñoCreacion(int añoCreacion) {
        this.añoCreacion = añoCreacion;
    }
    public abstract String mostrarPosicionRanking();
    public  abstract String comprarMonedas();
}

public class videoJuegos {

}
