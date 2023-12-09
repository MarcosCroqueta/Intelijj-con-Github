public class Cafetera {
    private int vasos;
    private float nivelAgua;
    private int maxConsumibles;
    private float consumibles[][];


}
    public Cafetera(int vasos, float nivelAgua, int maxConsumibles, float[][] consumibles) {
        this.vasos = vasos;
        this.nivelAgua = nivelAgua;
        this.maxConsumibles = maxConsumibles;
        this.consumibles = new float[maxConsumibles][4];
        recargaCafeteraInicial(consumibles);
    }

    public void recargaCafeteraInicial(float[][] recarga) {
        for (int i = 0; i < maxConsumibles ; i++) {
            for (int j = 0; j < 4; j++) {
                consumibles[i][j]=recarga[i][j];
            }
        }
    }

