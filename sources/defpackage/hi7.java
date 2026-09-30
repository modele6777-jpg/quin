package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hi7 implements li7 {
    public final Number a;

    public hi7(Number number) {
        this.a = number;
    }

    @Override // defpackage.li7
    public final int a() {
        return 2;
    }

    @Override // defpackage.li7
    public final Object getValue() {
        return Double.valueOf(this.a.doubleValue());
    }
}
