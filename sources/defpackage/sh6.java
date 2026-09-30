package defpackage;

import android.view.WindowId;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sh6 {
    public WindowId d;
    public boolean g;
    public final vz9 a = q1c.f(new hl9(9205357640488583168L));
    public final vz9 b = q1c.f(new ald(9205357640488583168L));
    public final qz9 c = new qz9(0.0f);
    public final osd e = new osd();
    public final vz9 f = q1c.f(null);

    public final ke6 a() {
        return (ke6) this.f.getValue();
    }

    public final long b() {
        return ((hl9) this.a.getValue()).a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HazeArea(");
        sb.append("positionOnScreen=" + hl9.i(b()) + ", ");
        sb.append("size=" + ald.g(((ald) this.b.getValue()).a) + ", ");
        sb.append("zIndex=" + this.c.j() + ", ");
        sb.append("contentLayer=" + a() + ", ");
        sb.append("contentDrawing=" + this.g);
        sb.append(")");
        return sb.toString();
    }
}
