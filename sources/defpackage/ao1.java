package defpackage;

import androidx.camera.camera2.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ao1 implements pm1 {
    public static final boolean f;
    public final h1b a;
    public final lkf b;
    public final s0f c;
    public final ace d;
    public final ace e;

    static {
        f = s74.a().b(TorchIsClosedAfterImageCapturingQuirk.class) != null;
    }

    public ao1(gh1 gh1Var, h1b h1bVar, lkf lkfVar, s0f s0fVar) {
        gh1Var.getClass();
        h1bVar.getClass();
        lkfVar.getClass();
        s0fVar.getClass();
        this.a = h1bVar;
        this.b = lkfVar;
        this.c = s0fVar;
        this.d = new ace(new qm1(gh1Var, 1));
        this.e = new ace(new p(20, this));
    }

    @Override // defpackage.pm1
    public final dn1 a(int i, int i2, int i3) {
        xn1 xn1Var = (xn1) this.e.getValue();
        xn1Var.getClass();
        return new dn1(xn1Var, i, i2, i3);
    }

    @Override // defpackage.pm1
    public final void b(int i) {
        ((xn1) this.e.getValue()).l = i;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // defpackage.pm1
    public final Object c(List list, int i, qh2 qh2Var, int i2, int i3, int i4, zn2 zn2Var) {
        yn1 yn1Var;
        int i5;
        boolean z;
        boolean z2;
        if (zn2Var instanceof yn1) {
            yn1Var = (yn1) zn2Var;
            int i6 = yn1Var.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                yn1Var.label = i6 - Integer.MIN_VALUE;
            } else {
                yn1Var = new yn1(this, zn2Var);
            }
        } else {
            yn1Var = new yn1(this, zn2Var);
        }
        yn1 yn1Var2 = yn1Var;
        Object obj = yn1Var2.result;
        int i7 = yn1Var2.label;
        if (i7 == 0) {
            jzb.q(obj);
            if (list != null && list.isEmpty()) {
                z = false;
                break;
            }
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    im1 im1Var = (im1) it.next();
                    boolean zBooleanValue = ((Boolean) this.d.getValue()).booleanValue();
                    im1Var.getClass();
                    int i8 = im1Var.c;
                    if (i != 3 || zBooleanValue) {
                        i5 = (i8 == -1 || i8 == 5) ? 2 : -1;
                    } else {
                        i5 = 4;
                    }
                    if (i5 != -1) {
                        i8 = i5;
                    }
                    if (i8 == 2) {
                        Integer num = (Integer) this.c.e.d();
                        if (num != null && num.intValue() == 1) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                break;
            }
            xn1 xn1Var = (xn1) this.e.getValue();
            yn1Var2.Z$0 = z;
            yn1Var2.label = 1;
            Object objC = xn1Var.c(list, i, qh2Var, i2, i3, i4, yn1Var2);
            bw2 bw2Var = bw2.a;
            if (objC == bw2Var) {
                return bw2Var;
            }
            boolean z3 = z;
            obj = objC;
            z2 = z3;
        } else {
            if (i7 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = yn1Var2.Z$0;
            jzb.q(obj);
        }
        List list2 = (List) obj;
        if (z2) {
            ynb.V(this.b.f, null, null, new zn1(list2, this, null), 3);
        }
        return list2;
    }
}
