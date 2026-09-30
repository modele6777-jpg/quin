package androidx.compose.ui.draw;

import defpackage.ald;
import defpackage.bn2;
import defpackage.c82;
import defpackage.fy9;
import defpackage.i09;
import defpackage.pa7;
import defpackage.qn4;
import defpackage.rs0;
import defpackage.s09;
import defpackage.ub3;
import defpackage.yi;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/draw/PainterElement;", "Ls09;", "Landroidx/compose/ui/draw/PainterNode;", "Lfy9;", "painter", "Lfy9;", "getPainter", "()Lfy9;", "ui"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
final /* data */ class PainterElement extends s09 {
    public final yi a;
    public final bn2 b;
    public final float c;
    public final c82 d;
    private final fy9 painter;

    public PainterElement(fy9 fy9Var, yi yiVar, bn2 bn2Var, float f, c82 c82Var) {
        this.painter = fy9Var;
        this.a = yiVar;
        this.b = bn2Var;
        this.c = f;
        this.d = c82Var;
    }

    @Override // defpackage.s09
    public final i09 create() {
        return new PainterNode(this.painter, this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        return pa7.t(this.painter, painterElement.painter) && pa7.t(this.a, painterElement.a) && pa7.t(this.b, painterElement.b) && Float.compare(this.c, painterElement.c) == 0 && pa7.t(this.d, painterElement.d);
    }

    public final int hashCode() {
        int iA = ub3.a(this.c, (this.b.hashCode() + ((this.a.hashCode() + ub3.d(this.painter.hashCode() * 31, 31, true)) * 31)) * 31, 31);
        c82 c82Var = this.d;
        return iA + (c82Var == null ? 0 : c82Var.hashCode());
    }

    public final String toString() {
        return "PainterElement(painter=" + this.painter + ", sizeToIntrinsics=true, alignment=" + this.a + ", contentScale=" + this.b + ", alpha=" + this.c + ", colorFilter=" + this.d + ")";
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        PainterNode painterNode = (PainterNode) i09Var;
        painterNode.getClass();
        boolean zA = ald.a(painterNode.getPainter().i(), this.painter.i());
        painterNode.q1(this.painter);
        painterNode.Z = this.a;
        painterNode.E0 = this.b;
        painterNode.F0 = this.c;
        painterNode.G0 = this.d;
        if (!zA) {
            rs0.F(painterNode);
        }
        qn4.G(painterNode);
    }
}
