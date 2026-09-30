package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gp1 implements c8f {
    public final c8f a;
    public final bm3 b;
    public final int c;

    public gp1(c8f c8fVar, bm3 bm3Var, int i) {
        this.a = c8fVar;
        this.b = bm3Var;
        this.c = i;
    }

    @Override // defpackage.bm3
    public final Object D(fm3 fm3Var, Object obj) {
        return this.a.D(fm3Var, obj);
    }

    @Override // defpackage.c8f
    public final ge8 L() {
        ge8 ge8VarL = this.a.L();
        ge8VarL.getClass();
        return ge8VarL;
    }

    @Override // defpackage.c8f
    public final boolean Q() {
        return true;
    }

    @Override // defpackage.y22
    public final tjd S() {
        tjd tjdVarS = this.a.S();
        tjdVarS.getClass();
        return tjdVarS;
    }

    @Override // defpackage.y22, defpackage.bm3
    public final y22 a() {
        return this.a.a();
    }

    @Override // defpackage.dm3
    public final ntd e() {
        ntd ntdVarE = this.a.e();
        ntdVarE.getClass();
        return ntdVarE;
    }

    @Override // defpackage.f00
    public final h10 getAnnotations() {
        return this.a.getAnnotations();
    }

    @Override // defpackage.c8f
    public final int getIndex() {
        return this.a.getIndex() + this.c;
    }

    @Override // defpackage.bm3
    public final t99 getName() {
        t99 name = this.a.getName();
        name.getClass();
        return name;
    }

    @Override // defpackage.c8f
    public final List getUpperBounds() {
        List upperBounds = this.a.getUpperBounds();
        upperBounds.getClass();
        return upperBounds;
    }

    @Override // defpackage.c8f, defpackage.y22
    public final j7f h() {
        j7f j7fVarH = this.a.h();
        j7fVarH.getClass();
        return j7fVarH;
    }

    @Override // defpackage.bm3
    public final bm3 k() {
        return this.b;
    }

    @Override // defpackage.c8f
    public final boolean s() {
        return this.a.s();
    }

    public final String toString() {
        return this.a + "[inner-copy]";
    }

    @Override // defpackage.c8f
    public final dsf x() {
        dsf dsfVarX = this.a.x();
        dsfVarX.getClass();
        return dsfVarX;
    }

    @Override // defpackage.bm3
    public final bm3 a() {
        return this.a.a();
    }

    @Override // defpackage.c8f, defpackage.y22, defpackage.bm3
    public final c8f a() {
        return this.a.a();
    }
}
