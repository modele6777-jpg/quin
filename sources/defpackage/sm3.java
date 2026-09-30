package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sm3 extends IllegalStateException {
    public final int currentCapacity;
    public final int requiredCapacity;

    public sm3(int i, int i2) {
        super(kv2.h(i, i2, "Buffer too small (", " < ", ")"));
        this.currentCapacity = i;
        this.requiredCapacity = i2;
    }
}
