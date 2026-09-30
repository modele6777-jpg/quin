package androidx.compose.foundation.text.modifiers;

import defpackage.i09;
import defpackage.k82;
import defpackage.lue;
import defpackage.mue;
import defpackage.pa7;
import defpackage.qn4;
import defpackage.rs0;
import defpackage.ry9;
import defpackage.s09;
import defpackage.scc;
import defpackage.tec;
import defpackage.ub3;
import defpackage.xp5;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;", "Ls09;", "Llue;", "Lk82;", "color", "Lk82;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
public final class TextStringSimpleElement extends s09 {
    public final String a;
    public final mue b;
    public final xp5 c;
    private final k82 color = null;
    public final int d;
    public final boolean e;
    public final int f;
    public final int g;

    public TextStringSimpleElement(String str, mue mueVar, xp5 xp5Var, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = mueVar;
        this.c = xp5Var;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
    }

    @Override // defpackage.s09
    public final i09 create() {
        k82 k82Var = this.color;
        lue lueVar = new lue();
        lueVar.Z = this.a;
        lueVar.E0 = this.b;
        lueVar.F0 = this.c;
        lueVar.G0 = this.d;
        lueVar.H0 = this.e;
        lueVar.I0 = this.f;
        lueVar.J0 = this.g;
        lueVar.K0 = k82Var;
        return lueVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        return pa7.t(this.color, textStringSimpleElement.color) && pa7.t(this.a, textStringSimpleElement.a) && pa7.t(this.b, textStringSimpleElement.b) && pa7.t(this.c, textStringSimpleElement.c) && this.d == textStringSimpleElement.d && this.e == textStringSimpleElement.e && this.f == textStringSimpleElement.f && this.g == textStringSimpleElement.g;
    }

    public final int hashCode() {
        int iD = (((ub3.d(ub3.b(this.d, (this.c.hashCode() + tec.b(this.b, this.a.hashCode() * 31, 31)) * 31, 31), 31, this.e) + this.f) * 31) + this.g) * 31;
        k82 k82Var = this.color;
        return iD + (k82Var != null ? k82Var.hashCode() : 0);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        boolean z;
        lue lueVar = (lue) i09Var;
        k82 k82Var = this.color;
        boolean zT = pa7.t(k82Var, lueVar.K0);
        lueVar.K0 = k82Var;
        boolean z2 = false;
        boolean z3 = true;
        mue mueVar = this.b;
        if (zT) {
            mue mueVar2 = lueVar.E0;
            if (mueVar == mueVar2) {
                mueVar.getClass();
            } else if (!mueVar.a.c(mueVar2.a)) {
                z = true;
            }
            z = false;
        } else {
            z = true;
        }
        String str = lueVar.Z;
        String str2 = this.a;
        if (!pa7.t(str, str2)) {
            lueVar.Z = str2;
            lueVar.O0 = null;
            z2 = true;
        }
        boolean z4 = !lueVar.E0.d(mueVar);
        lueVar.E0 = mueVar;
        int i = lueVar.J0;
        int i2 = this.g;
        if (i != i2) {
            lueVar.J0 = i2;
            z4 = true;
        }
        int i3 = lueVar.I0;
        int i4 = this.f;
        if (i3 != i4) {
            lueVar.I0 = i4;
            z4 = true;
        }
        boolean z5 = lueVar.H0;
        boolean z6 = this.e;
        if (z5 != z6) {
            lueVar.H0 = z6;
            z4 = true;
        }
        xp5 xp5Var = lueVar.F0;
        xp5 xp5Var2 = this.c;
        if (!pa7.t(xp5Var, xp5Var2)) {
            lueVar.F0 = xp5Var2;
            z4 = true;
        }
        int i5 = lueVar.G0;
        int i6 = this.d;
        if (i5 == i6) {
            z3 = z4;
        } else {
            lueVar.G0 = i6;
        }
        if (z2 || z3) {
            ry9 ry9VarL1 = lueVar.l1();
            String str3 = lueVar.Z;
            mue mueVar3 = lueVar.E0;
            xp5 xp5Var3 = lueVar.F0;
            int i7 = lueVar.G0;
            boolean z7 = lueVar.H0;
            int i8 = lueVar.I0;
            int i9 = lueVar.J0;
            ry9VarL1.a = str3;
            ry9VarL1.b = mueVar3;
            ry9VarL1.c = xp5Var3;
            ry9VarL1.d = i7;
            ry9VarL1.e = z7;
            ry9VarL1.f = i8;
            ry9VarL1.g = i9;
            ry9VarL1.s = (ry9VarL1.s << 2) | 2;
            ry9VarL1.c();
        }
        if (lueVar.Y) {
            if (z2 || (z && lueVar.N0 != null)) {
                scc.k(lueVar);
            }
            if (z2 || z3) {
                rs0.F(lueVar);
                qn4.G(lueVar);
            }
            if (z) {
                qn4.G(lueVar);
            }
        }
    }
}
