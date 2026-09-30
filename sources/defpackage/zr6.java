package defpackage;

import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zr6 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ds6 b;
    public final /* synthetic */ int c;

    public /* synthetic */ zr6(ds6 ds6Var, int i, List list, boolean z) {
        this.a = 2;
        this.b = ds6Var;
        this.c = i;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        switch (this.a) {
            case 0:
                ds6 ds6Var = this.b;
                int i = this.c;
                ds6Var.y.getClass();
                try {
                    ds6Var.L0.G(i, ay4.CANCEL);
                    synchronized (ds6Var) {
                        ds6Var.N0.remove(Integer.valueOf(i));
                    }
                } catch (IOException unused) {
                }
                return wef.a;
            case 1:
                ds6 ds6Var2 = this.b;
                int i2 = this.c;
                ds6Var2.y.getClass();
                synchronized (ds6Var2) {
                    ds6Var2.N0.remove(Integer.valueOf(i2));
                }
                return wef.a;
            default:
                ds6 ds6Var3 = this.b;
                int i3 = this.c;
                ds6Var3.y.getClass();
                try {
                    ds6Var3.L0.G(i3, ay4.CANCEL);
                    synchronized (ds6Var3) {
                        ds6Var3.N0.remove(Integer.valueOf(i3));
                    }
                } catch (IOException unused2) {
                }
                return wef.a;
        }
    }

    public /* synthetic */ zr6(ds6 ds6Var, int i, Object obj, int i2) {
        this.a = i2;
        this.b = ds6Var;
        this.c = i;
    }
}
