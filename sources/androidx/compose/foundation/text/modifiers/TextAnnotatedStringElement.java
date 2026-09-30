package androidx.compose.foundation.text.modifiers;

import defpackage.a26;
import defpackage.co0;
import defpackage.i09;
import defpackage.k00;
import defpackage.k82;
import defpackage.mue;
import defpackage.ome;
import defpackage.pa7;
import defpackage.s09;
import defpackage.tec;
import defpackage.ub3;
import defpackage.xp5;
import defpackage.z7c;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;", "Ls09;", "Lome;", "Lk82;", "color", "Lk82;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
public final class TextAnnotatedStringElement extends s09 {
    public final k00 a;
    public final mue b;
    public final xp5 c;
    private final k82 color = null;
    public final a26 d;
    public final int e;
    public final boolean f;
    public final int g;
    public final int v;
    public final List w;
    public final a26 x;
    public final co0 y;
    public final a26 z;

    public TextAnnotatedStringElement(k00 k00Var, mue mueVar, xp5 xp5Var, a26 a26Var, int i, boolean z, int i2, int i3, List list, a26 a26Var2, co0 co0Var, a26 a26Var3) {
        this.a = k00Var;
        this.b = mueVar;
        this.c = xp5Var;
        this.d = a26Var;
        this.e = i;
        this.f = z;
        this.g = i2;
        this.v = i3;
        this.w = list;
        this.x = a26Var2;
        this.y = co0Var;
        this.z = a26Var3;
    }

    @Override // defpackage.s09
    public final i09 create() {
        return new ome(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, this.x, null, this.color, this.y, this.z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        return pa7.t(this.color, textAnnotatedStringElement.color) && pa7.t(this.a, textAnnotatedStringElement.a) && pa7.t(this.b, textAnnotatedStringElement.b) && pa7.t(this.w, textAnnotatedStringElement.w) && pa7.t(this.c, textAnnotatedStringElement.c) && this.d == textAnnotatedStringElement.d && this.z == textAnnotatedStringElement.z && this.e == textAnnotatedStringElement.e && this.f == textAnnotatedStringElement.f && this.g == textAnnotatedStringElement.g && this.v == textAnnotatedStringElement.v && this.x == textAnnotatedStringElement.x;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + tec.b(this.b, this.a.hashCode() * 31, 31)) * 31;
        a26 a26Var = this.d;
        int iD = (((ub3.d(ub3.b(this.e, (iHashCode + (a26Var != null ? a26Var.hashCode() : 0)) * 31, 31), 31, this.f) + this.g) * 31) + this.v) * 31;
        List list = this.w;
        int iHashCode2 = (iD + (list != null ? list.hashCode() : 0)) * 31;
        a26 a26Var2 = this.x;
        int iHashCode3 = (iHashCode2 + (a26Var2 != null ? a26Var2.hashCode() : 0)) * 961;
        k82 k82Var = this.color;
        int iHashCode4 = (iHashCode3 + (k82Var != null ? k82Var.hashCode() : 0)) * 31;
        a26 a26Var3 = this.z;
        return iHashCode4 + (a26Var3 != null ? a26Var3.hashCode() : 0);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        boolean z;
        ome omeVar = (ome) i09Var;
        k82 k82Var = this.color;
        boolean zT = pa7.t(k82Var, omeVar.O0);
        omeVar.O0 = k82Var;
        if (zT) {
            mue mueVar = omeVar.E0;
            mue mueVar2 = this.b;
            if (mueVar2 == mueVar) {
                mueVar2.getClass();
            } else if (!mueVar2.a.c(mueVar.a)) {
                z = true;
            }
            z = false;
        } else {
            z = true;
        }
        omeVar.l1(z, omeVar.q1(this.a), omeVar.p1(this.b, this.w, this.v, this.g, this.f, this.c, this.e, this.y), omeVar.o1(this.d, this.x, null, this.z));
    }
}
