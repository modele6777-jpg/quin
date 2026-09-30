package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public enum r8b {
    Large(56.0f, 345.0f, 1.0f, 1.0f),
    Medium(48.0f, 168.0f, 0.85714287f, 0.4869565f);

    private final float decorationScale;
    private final float defaultWidth;
    private final float height;
    private final float horizontalDecorationScale;

    r8b(float f, float f2, float f3, float f4) {
        this.height = f;
        this.defaultWidth = f2;
        this.decorationScale = f3;
        this.horizontalDecorationScale = f4;
    }

    public final float a() {
        return this.decorationScale;
    }

    public final float b() {
        return this.defaultWidth;
    }

    public final float c() {
        return this.height;
    }

    public final float d() {
        return this.horizontalDecorationScale;
    }
}
