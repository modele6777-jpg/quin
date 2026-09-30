package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class uv6 extends gf6 {
    public final int a = 1;
    public final mb5 b = mb5.d;

    @Override // defpackage.gf6
    public final mb5 a() {
        return this.b;
    }

    public final String toString() {
        String strK;
        StringBuilder sb = new StringBuilder("ImageFormatFeature(imageCaptureOutputFormat=");
        int i = this.a;
        if (i != 0) {
            strK = i != 1 ? tec.k("UNDEFINED(", i, ')') : "JPEG_R";
        } else {
            strK = "JPEG";
        }
        return ub3.l(sb, strK, ')');
    }
}
