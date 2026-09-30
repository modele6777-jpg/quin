package androidx.compose.ui.graphics.painter;

import defpackage.c82;
import defpackage.cv6;
import defpackage.db6;
import defpackage.e77;
import defpackage.fy9;
import defpackage.ib8;
import defpackage.ks;
import defpackage.ks0;
import defpackage.pa7;
import defpackage.qc0;
import defpackage.sn4;
import defpackage.w67;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/painter/BitmapPainter;", "Lfy9;", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
public final class BitmapPainter extends fy9 {
    public final cv6 f;
    public final long g;
    public int v = 1;
    public final long w;
    public float x;
    public c82 y;

    public BitmapPainter(cv6 cv6Var, long j) {
        int i;
        this.f = cv6Var;
        this.g = j;
        int i2 = (int) (j >> 32);
        if (i2 >= 0 && (i = (int) (4294967295L & j)) >= 0) {
            ks ksVar = (ks) cv6Var;
            if (i2 <= ksVar.a.getWidth() && i <= ksVar.a.getHeight()) {
                this.w = j;
                this.x = 1.0f;
                return;
            }
        }
        qc0.j("Failed requirement.");
        throw null;
    }

    @Override // defpackage.fy9
    public final boolean b(float f) {
        this.x = f;
        return true;
    }

    @Override // defpackage.fy9
    public final boolean e(c82 c82Var) {
        this.y = c82Var;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitmapPainter)) {
            return false;
        }
        BitmapPainter bitmapPainter = (BitmapPainter) obj;
        return pa7.t(this.f, bitmapPainter.f) && w67.b(0L, 0L) && e77.b(this.g, bitmapPainter.g) && this.v == bitmapPainter.v;
    }

    public final int hashCode() {
        return Integer.hashCode(this.v) + ib8.b(ib8.b(this.f.hashCode() * 31, 31, 0L), 31, this.g);
    }

    @Override // defpackage.fy9
    /* JADX INFO: renamed from: i */
    public final long getE0() {
        return db6.Y0(this.w);
    }

    @Override // defpackage.fy9
    public final void j(sn4 sn4Var) {
        sn4.g0(sn4Var, this.f, 0L, this.g, 0L, (((long) Math.round(Float.intBitsToFloat((int) (sn4Var.f() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (sn4Var.f() & 4294967295L)))) & 4294967295L), this.x, this.y, this.v, 328);
    }

    public final String toString() {
        String str;
        String strE = w67.e(0L);
        String strC = e77.c(this.g);
        int i = this.v;
        if (i == 0) {
            str = "None";
        } else if (i == 1) {
            str = "Low";
        } else if (i == 2) {
            str = "Medium";
        } else {
            str = i == 3 ? "High" : "Unknown";
        }
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.f);
        sb.append(", srcOffset=");
        sb.append(strE);
        sb.append(", srcSize=");
        return ks0.m(sb, strC, ", filterQuality=", str, ")");
    }
}
