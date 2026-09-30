package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ti1 implements tzb {
    public final /* synthetic */ int b;
    public final tzb c;

    public ti1(long j, int i) {
        this.b = i;
        switch (i) {
            case 1:
                this.c = new nye(j, new si1(j));
                break;
            default:
                this.c = new ti1(j, 1);
                break;
        }
    }

    @Override // defpackage.tzb
    public final long a() {
        int i = this.b;
        tzb tzbVar = this.c;
        switch (i) {
            case 0:
                return ((nye) ((ti1) tzbVar).c).b;
            default:
                return ((nye) tzbVar).b;
        }
    }

    @Override // defpackage.tzb
    public final szb b(ri1 ri1Var) {
        int i = this.b;
        tzb tzbVar = this.c;
        switch (i) {
            case 0:
                if (((nye) ((ti1) tzbVar).c).b(ri1Var).b) {
                    return szb.e;
                }
                Throwable th = (Throwable) ri1Var.c;
                if (th instanceof nk1) {
                    b21.v("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                    if (((nk1) th).getAvailableCameraCount() > 0) {
                        return szb.f;
                    }
                }
                return szb.d;
            default:
                return ((nye) tzbVar).b(ri1Var);
        }
    }
}
