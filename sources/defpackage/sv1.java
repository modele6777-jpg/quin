package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class sv1 implements dr8 {
    public final String b;
    public final dr8[] c;

    public sv1(String str, dr8[] dr8VarArr) {
        this.b = str;
        this.c = dr8VarArr;
    }

    @Override // defpackage.dr8
    public final Collection a(ez3 ez3Var, a26 a26Var) {
        ez3Var.getClass();
        dr8[] dr8VarArr = this.c;
        int length = dr8VarArr.length;
        if (length == 0) {
            return pu4.a;
        }
        if (length == 1) {
            return dr8VarArr[0].a(ez3Var, a26Var);
        }
        Collection collectionH = null;
        for (dr8 dr8Var : dr8VarArr) {
            collectionH = sfc.h(collectionH, dr8Var.a(ez3Var, a26Var));
        }
        return collectionH == null ? xu4.a : collectionH;
    }

    @Override // defpackage.dr8
    public final Collection b(t99 t99Var, lf9 lf9Var) {
        t99Var.getClass();
        dr8[] dr8VarArr = this.c;
        int length = dr8VarArr.length;
        if (length == 0) {
            return pu4.a;
        }
        if (length == 1) {
            return dr8VarArr[0].b(t99Var, lf9Var);
        }
        Collection collectionH = null;
        for (dr8 dr8Var : dr8VarArr) {
            collectionH = sfc.h(collectionH, dr8Var.b(t99Var, lf9Var));
        }
        return collectionH == null ? xu4.a : collectionH;
    }

    @Override // defpackage.dr8
    public final Set c() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (dr8 dr8Var : this.c) {
            x72.g0(linkedHashSet, dr8Var.c());
        }
        return linkedHashSet;
    }

    @Override // defpackage.dr8
    public final Set d() {
        dr8[] dr8VarArr = this.c;
        dr8VarArr.getClass();
        return rs0.y(dr8VarArr.length == 0 ? pu4.a : new sd0(0, dr8VarArr));
    }

    @Override // defpackage.dr8
    public final y22 e(t99 t99Var, lf9 lf9Var) {
        t99Var.getClass();
        lf9Var.getClass();
        y22 y22Var = null;
        for (dr8 dr8Var : this.c) {
            y22 y22VarE = dr8Var.e(t99Var, lf9Var);
            if (y22VarE != null) {
                if (!(y22VarE instanceof z22) || !((tq8) y22VarE).w()) {
                    return y22VarE;
                }
                if (y22Var == null) {
                    y22Var = y22VarE;
                }
            }
        }
        return y22Var;
    }

    @Override // defpackage.dr8
    public final Collection f(t99 t99Var, lf9 lf9Var) {
        t99Var.getClass();
        dr8[] dr8VarArr = this.c;
        int length = dr8VarArr.length;
        if (length == 0) {
            return pu4.a;
        }
        if (length == 1) {
            return dr8VarArr[0].f(t99Var, lf9Var);
        }
        Collection collectionH = null;
        for (dr8 dr8Var : dr8VarArr) {
            collectionH = sfc.h(collectionH, dr8Var.f(t99Var, lf9Var));
        }
        return collectionH == null ? xu4.a : collectionH;
    }

    @Override // defpackage.dr8
    public final Set g() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (dr8 dr8Var : this.c) {
            x72.g0(linkedHashSet, dr8Var.g());
        }
        return linkedHashSet;
    }

    public final String toString() {
        return this.b;
    }
}
