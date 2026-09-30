package defpackage;

import android.util.Range;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class s9e {
    public final int a;
    public final int b;
    public final boolean c;
    public final vuf d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final Range i;
    public final boolean j;

    public s9e(int i, int i2, boolean z, vuf vufVar, boolean z2, boolean z3, boolean z4, boolean z5, Range range, boolean z6) {
        vufVar.getClass();
        range.getClass();
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = vufVar;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = range;
        this.j = z6;
    }

    public static s9e a(s9e s9eVar, boolean z, Range range, int i) {
        int i2 = s9eVar.a;
        int i3 = s9eVar.b;
        boolean z2 = s9eVar.c;
        vuf vufVar = s9eVar.d;
        boolean z3 = s9eVar.e;
        boolean z4 = s9eVar.f;
        boolean z5 = s9eVar.g;
        if ((i & 256) != 0) {
            range = s9eVar.i;
        }
        Range range2 = range;
        boolean z6 = s9eVar.j;
        vufVar.getClass();
        range2.getClass();
        return new s9e(i2, i3, z2, vufVar, z3, z4, z5, z, range2, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s9e)) {
            return false;
        }
        s9e s9eVar = (s9e) obj;
        return this.a == s9eVar.a && this.b == s9eVar.b && this.c == s9eVar.c && this.d == s9eVar.d && this.e == s9eVar.e && this.f == s9eVar.f && this.g == s9eVar.g && this.h == s9eVar.h && pa7.t(this.i, s9eVar.i) && this.j == s9eVar.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + ((this.i.hashCode() + ub3.d(ub3.d(ub3.d(ub3.d((this.d.hashCode() + ub3.d(ub3.b(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c)) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31);
    }

    public final String toString() {
        return "FeatureSettings(cameraMode=" + this.a + ", requiredMaxBitDepth=" + this.b + ", hasVideoCapture=" + this.c + ", videoStabilization=" + this.d + ", isUltraHdrOn=" + this.e + ", isHighSpeedOn=" + this.f + ", isFeatureComboInvocation=" + this.g + ", requiresFeatureComboQuery=" + this.h + ", targetFpsRange=" + this.i + ", isStrictFpsRequired=" + this.j + ')';
    }
}
