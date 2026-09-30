package defpackage;

import android.app.Application;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l14 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ l14(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        int i2 = 17;
        wef wefVar = wef.a;
        i8c i8cVar = sf2.a;
        int i3 = 6;
        Context context = this.b;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zI = l46Var.i(context);
                    Object objR = l46Var.R();
                    if (zI || objR == i8cVar) {
                        objR = new u8(context, 16);
                        l46Var.p0(objR);
                    }
                    j74.n("Open", (x16) objR, l46Var, 6);
                    boolean zI2 = l46Var.i(context);
                    Object objR2 = l46Var.R();
                    if (zI2 || objR2 == i8cVar) {
                        objR2 = new u8(context, i2);
                        l46Var.p0(objR2);
                    }
                    j74.n("Welcome", (x16) objR2, l46Var, 6);
                    boolean zI3 = l46Var.i(context);
                    Object objR3 = l46Var.R();
                    if (zI3 || objR3 == i8cVar) {
                        objR3 = new u8(context, 18);
                        l46Var.p0(objR3);
                    }
                    j74.n("WelcomeBack", (x16) objR3, l46Var, 6);
                    boolean zI4 = l46Var.i(context);
                    Object objR4 = l46Var.R();
                    if (zI4 || objR4 == i8cVar) {
                        objR4 = new u8(context, 19);
                        l46Var.p0(objR4);
                    }
                    j74.n("Upgrade", (x16) objR4, l46Var, 6);
                    boolean zI5 = l46Var.i(context);
                    Object objR5 = l46Var.R();
                    if (zI5 || objR5 == i8cVar) {
                        objR5 = new u8(context, 20);
                        l46Var.p0(objR5);
                    }
                    j74.n("SignIn", (x16) objR5, l46Var, 6);
                    Object objR6 = l46Var.R();
                    if (objR6 == i8cVar) {
                        objR6 = new vg3(28);
                        l46Var.p0(objR6);
                    }
                    j74.n("Reset", (x16) objR6, l46Var, 54);
                    boolean zI6 = l46Var.i(context);
                    Object objR7 = l46Var.R();
                    if (zI6 || objR7 == i8cVar) {
                        objR7 = new u8(context, 21);
                        l46Var.p0(objR7);
                    }
                    j74.n("Simulate New User", (x16) objR7, l46Var, 6);
                } else {
                    l46Var.Z();
                }
                return wefVar;
            case 1:
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zI7 = l46Var2.i(context);
                    Object objR8 = l46Var2.R();
                    if (zI7 || objR8 == i8cVar) {
                        objR8 = new u8(context, 13);
                        l46Var2.p0(objR8);
                    }
                    j74.n("剩余 1 次", (x16) objR8, l46Var2, 6);
                    boolean zI8 = l46Var2.i(context);
                    Object objR9 = l46Var2.R();
                    if (zI8 || objR9 == i8cVar) {
                        objR9 = new u8(context, 14);
                        l46Var2.p0(objR9);
                    }
                    j74.n("已用完", (x16) objR9, l46Var2, 6);
                } else {
                    l46Var2.Z();
                }
                return wefVar;
            case 2:
                l46 l46Var3 = (l46) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (l46Var3.W(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean zI9 = l46Var3.i(context);
                    Object objR10 = l46Var3.R();
                    if (zI9 || objR10 == i8cVar) {
                        objR10 = new u8(context, i3);
                        l46Var3.p0(objR10);
                    }
                    j74.n("剩余 1 次", (x16) objR10, l46Var3, 6);
                    boolean zI10 = l46Var3.i(context);
                    Object objR11 = l46Var3.R();
                    if (zI10 || objR11 == i8cVar) {
                        objR11 = new u8(context, 7);
                        l46Var3.p0(objR11);
                    }
                    j74.n("已用完", (x16) objR11, l46Var3, 6);
                } else {
                    l46Var3.Z();
                }
                return wefVar;
            case 3:
                l46 l46Var4 = (l46) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (l46Var4.W(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    boolean zI11 = l46Var4.i(context);
                    Object objR12 = l46Var4.R();
                    if (zI11 || objR12 == i8cVar) {
                        objR12 = new u8(context, 9);
                        l46Var4.p0(objR12);
                    }
                    j74.n("Send", (x16) objR12, l46Var4, 6);
                    boolean zI12 = l46Var4.i(context);
                    Object objR13 = l46Var4.R();
                    if (zI12 || objR13 == i8cVar) {
                        objR13 = new u8(context, 10);
                        l46Var4.p0(objR13);
                    }
                    j74.n("Send+Cancel", (x16) objR13, l46Var4, 6);
                    boolean zI13 = l46Var4.i(context);
                    Object objR14 = l46Var4.R();
                    if (zI13 || objR14 == i8cVar) {
                        objR14 = new u8(context, 11);
                        l46Var4.p0(objR14);
                    }
                    j74.n("Paywall", (x16) objR14, l46Var4, 6);
                } else {
                    l46Var4.Z();
                }
                return wefVar;
            case 4:
                l46 l46Var5 = (l46) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (l46Var5.W(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    boolean zI14 = l46Var5.i(context);
                    Object objR15 = l46Var5.R();
                    if (zI14 || objR15 == i8cVar) {
                        objR15 = new u8(context, 12);
                        l46Var5.p0(objR15);
                    }
                    j74.n("打开 (新用户)", (x16) objR15, l46Var5, 6);
                    Object objR16 = l46Var5.R();
                    if (objR16 == i8cVar) {
                        objR16 = new vg3(i2);
                        l46Var5.p0(objR16);
                    }
                    j74.n("Reset onboarding", (x16) objR16, l46Var5, 54);
                } else {
                    l46Var5.Z();
                }
                return wefVar;
            case 5:
                ((nfc) obj).getClass();
                ((nz9) obj2).getClass();
                return (Application) context;
            default:
                ((nfc) obj).getClass();
                ((nz9) obj2).getClass();
                return context;
        }
    }
}
