package defpackage;

import com.adjust.sdk.network.ErrorCodes;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k47 b;

    public /* synthetic */ hk0(k47 k47Var, rr5 rr5Var, vm3 vm3Var) {
        this.a = 9;
        this.b = k47Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        k47 k47Var = this.b;
        switch (i) {
            case 0:
                t45 t45Var = (t45) k47Var.c;
                String str = pqf.a;
                ro3 ro3Var = t45Var.a.s;
                ro3Var.M(ro3Var.L(), 1029, new qd3(15));
                break;
            case 1:
                t45 t45Var2 = (t45) k47Var.c;
                String str2 = pqf.a;
                ro3 ro3Var2 = t45Var2.a.s;
                ro3Var2.M(ro3Var2.L(), 1011, new oo3(8));
                break;
            case 2:
                t45 t45Var3 = (t45) k47Var.c;
                String str3 = pqf.a;
                ro3 ro3Var3 = t45Var3.a.s;
                ro3Var3.M(ro3Var3.L(), 1010, new oo3(10));
                break;
            case 3:
                t45 t45Var4 = (t45) k47Var.c;
                String str4 = pqf.a;
                ro3 ro3Var4 = t45Var4.a.s;
                ro3Var4.M(ro3Var4.L(), 1032, new oo3(11));
                break;
            case 4:
                t45 t45Var5 = (t45) k47Var.c;
                String str5 = pqf.a;
                ro3 ro3Var5 = t45Var5.a.s;
                ro3Var5.M(ro3Var5.L(), 1008, new qd3(5));
                break;
            case 5:
                t45 t45Var6 = (t45) k47Var.c;
                String str6 = pqf.a;
                ro3 ro3Var6 = t45Var6.a.s;
                ro3Var6.M(ro3Var6.L(), 1012, new oo3(16));
                break;
            case 6:
                t45 t45Var7 = (t45) k47Var.c;
                String str7 = pqf.a;
                ro3 ro3Var7 = t45Var7.a.s;
                ro3Var7.M(ro3Var7.L(), ErrorCodes.IO_EXCEPTION, new qd3(20));
                break;
            case 7:
                t45 t45Var8 = (t45) k47Var.c;
                String str8 = pqf.a;
                ro3 ro3Var8 = t45Var8.a.s;
                ro3Var8.M(ro3Var8.L(), 1031, new oo3(1));
                break;
            case 8:
                t45 t45Var9 = (t45) k47Var.c;
                String str9 = pqf.a;
                ro3 ro3Var9 = t45Var9.a.s;
                ro3Var9.M(ro3Var9.L(), 1014, new oo3(6));
                break;
            default:
                t45 t45Var10 = (t45) k47Var.c;
                String str10 = pqf.a;
                ro3 ro3Var10 = t45Var10.a.s;
                ro3Var10.M(ro3Var10.L(), 1009, new oo3(3));
                break;
        }
    }

    public /* synthetic */ hk0(k47 k47Var, long j) {
        this.a = 2;
        this.b = k47Var;
    }

    public /* synthetic */ hk0(k47 k47Var, int i, long j, long j2) {
        this.a = 1;
        this.b = k47Var;
    }

    public /* synthetic */ hk0(k47 k47Var, Object obj, int i) {
        this.a = i;
        this.b = k47Var;
    }

    public /* synthetic */ hk0(k47 k47Var, String str, long j, long j2) {
        this.a = 4;
        this.b = k47Var;
    }
}
