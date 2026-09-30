package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class uy9 {
    public static final long a;
    public static final /* synthetic */ int b = 0;

    static {
        xue[] xueVarArr = wue.b;
        a = wue.c;
    }

    public static final ty9 a(ty9 ty9Var, int i, int i2, long j, ete eteVar, ofa ofaVar, y58 y58Var, int i3, int i4, cue cueVar) {
        long j2;
        int i5 = i;
        int i6 = i2;
        long j3 = j;
        ete eteVar2 = eteVar;
        ofa ofaVar2 = ofaVar;
        y58 y58Var2 = y58Var;
        int i7 = i3;
        int i8 = i4;
        cue cueVar2 = cueVar;
        if (i5 == 0 || i5 == ty9Var.a) {
            xue[] xueVarArr = wue.b;
            if ((j3 & 1095216660480L) == 0) {
                j2 = 0;
            } else {
                j2 = 0;
                if (wue.a(j3, ty9Var.c)) {
                }
            }
            if ((eteVar2 == null || eteVar2.equals(ty9Var.d)) && ((i6 == 0 || i6 == ty9Var.b) && ((ofaVar2 == null || ofaVar2.equals(ty9Var.e)) && ((y58Var2 == null || y58Var2.equals(ty9Var.f)) && ((i7 == 0 || i7 == ty9Var.g) && ((i8 == 0 || i8 == ty9Var.h) && (cueVar2 == null || cueVar2.equals(ty9Var.i)))))))) {
                return ty9Var;
            }
        } else {
            j2 = 0;
        }
        xue[] xueVarArr2 = wue.b;
        if ((j3 & 1095216660480L) == j2) {
            j3 = ty9Var.c;
        }
        if (eteVar2 == null) {
            eteVar2 = ty9Var.d;
        }
        if (i5 == 0) {
            i5 = ty9Var.a;
        }
        if (i6 == 0) {
            i6 = ty9Var.b;
        }
        ofa ofaVar3 = ty9Var.e;
        if (ofaVar3 != null && ofaVar2 == null) {
            ofaVar2 = ofaVar3;
        }
        if (y58Var2 == null) {
            y58Var2 = ty9Var.f;
        }
        if (i7 == 0) {
            i7 = ty9Var.g;
        }
        if (i8 == 0) {
            i8 = ty9Var.h;
        }
        if (cueVar2 == null) {
            cueVar2 = ty9Var.i;
        }
        return new ty9(i5, i6, j3, eteVar2, ofaVar2, y58Var2, i7, i8, cueVar2);
    }
}
