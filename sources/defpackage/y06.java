package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class y06 {
    public v06 a;

    public final h16 a(Context context, c16 c16Var) {
        h16 f16Var;
        u06 u06Var = u06.CopyLink;
        context.getClass();
        c16Var.getClass();
        try {
            String str = c16Var.f;
            Object systemService = context.getSystemService("clipboard");
            ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
            if (clipboardManager == null) {
                f16Var = new f16(u06Var);
            } else {
                clipboardManager.setPrimaryClip(ClipData.newPlainText("friend-coupon", str));
                f16Var = e16.a;
            }
        } catch (Exception unused) {
            f16Var = new f16(u06Var);
        }
        if (!(f16Var instanceof f16) && this.a == v06.b) {
            this.a = v06.c;
        }
        return f16Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Context context, u06 u06Var, c16 c16Var, zn2 zn2Var) {
        w06 w06Var;
        if (zn2Var instanceof w06) {
            w06Var = (w06) zn2Var;
            int i = w06Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                w06Var.label = i - Integer.MIN_VALUE;
            } else {
                w06Var = new w06(this, zn2Var);
            }
        } else {
            w06Var = new w06(this, zn2Var);
        }
        Object objA = w06Var.result;
        int i2 = w06Var.label;
        boolean zBooleanValue = false;
        try {
            if (i2 == 0) {
                jzb.q(objA);
                if (u06Var.a() == null) {
                    qc0.j("Required value was null.");
                    return null;
                }
                int i3 = (u06Var == u06.WeChat || u06Var == u06.WeChatMoments) ? 1 : 0;
                String str = c16Var.a;
                String str2 = i3 != 0 ? c16Var.b : c16Var.c;
                String str3 = i3 != 0 ? c16Var.d : c16Var.e;
                w06Var.L$0 = null;
                w06Var.L$1 = u06Var;
                w06Var.L$2 = null;
                w06Var.L$3 = null;
                w06Var.L$4 = null;
                w06Var.I$0 = i3;
                w06Var.label = 1;
                objA = wt6.a(context, str, str2, str3);
                Object obj = bw2.a;
                if (objA == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                u06Var = (u06) w06Var.L$1;
                jzb.q(objA);
            }
            zBooleanValue = ((Boolean) objA).booleanValue();
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
        return zBooleanValue ? new g16(u06Var) : new f16(u06Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(Context context, u06 u06Var, c16 c16Var, zn2 zn2Var) {
        x06 x06Var;
        if (zn2Var instanceof x06) {
            x06Var = (x06) zn2Var;
            int i = x06Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                x06Var.label = i - Integer.MIN_VALUE;
            } else {
                x06Var = new x06(this, zn2Var);
            }
        } else {
            x06Var = new x06(this, zn2Var);
        }
        Object objB = x06Var.result;
        int i2 = x06Var.label;
        if (i2 == 0) {
            jzb.q(objB);
            if (u06Var == u06.CopyLink) {
                return a(context, c16Var);
            }
            x06Var.L$0 = null;
            x06Var.L$1 = null;
            x06Var.L$2 = null;
            x06Var.L$3 = null;
            x06Var.label = 1;
            objB = b(context, u06Var, c16Var, x06Var);
            Object obj = bw2.a;
            if (objB == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(objB);
        }
        h16 h16Var = (h16) objB;
        if (!(h16Var instanceof f16) && this.a == v06.b) {
            this.a = v06.c;
        }
        return h16Var;
    }
}
