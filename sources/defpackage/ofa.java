package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ofa {
    public static final ofa c = new ofa(0, false);
    public final boolean a;
    public final int b;

    public ofa() {
        this.a = false;
        this.b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ofa)) {
            return false;
        }
        ofa ofaVar = (ofa) obj;
        return this.a == ofaVar.a && this.b == ofaVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.a + ", emojiSupportMatch=" + xt4.a(this.b) + ")";
    }

    public ofa(int i, boolean z) {
        this.a = z;
        this.b = i;
    }
}
