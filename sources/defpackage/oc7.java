package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import tech.chatmind.api.InvitationInfo;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class oc7 extends gcg {
    public static final /* synthetic */ int v = 0;
    public final bc7 d;
    public final wt6 e;
    public final vz9 f = q1c.f(new InvitationInfo(0, 0, 20, 0, 0));
    public final vz9 g = q1c.f(null);

    public oc7(bc7 bc7Var, wt6 wt6Var) {
        this.d = bc7Var;
        this.e = wt6Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(zn2 zn2Var) {
        hc7 hc7Var;
        if (zn2Var instanceof hc7) {
            hc7Var = (hc7) zn2Var;
            int i = hc7Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                hc7Var.label = i - Integer.MIN_VALUE;
            } else {
                hc7Var = new hc7(this, zn2Var);
            }
        } else {
            hc7Var = new hc7(this, zn2Var);
        }
        Object objB = hc7Var.result;
        int i2 = hc7Var.label;
        if (i2 == 0) {
            jzb.q(objB);
            String str = (String) this.g.getValue();
            if (str != null) {
                return str;
            }
            ic7 ic7Var = new ic7(this, null);
            hc7Var.label = 1;
            objB = lw2.b(ic7Var, hc7Var);
            bw2 bw2Var = bw2.a;
            if (objB == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(objB);
        }
        Object objB2 = ((ezb) objB).b();
        Throwable thA = ezb.a(objB2);
        if (thA != null) {
            d().c("Failed to generateCode", thA);
            jcc.k(1, new Integer(R.string.invitation_generate_code_failed));
        }
        return (String) (objB2 instanceof dzb ? null : objB2);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0133  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Instruction removed from duplicated block: B:33:0x0133, please report this as an issue */
    public final Object h(Context context, gbd gbdVar, String str, zn2 zn2Var) {
        mc7 mc7Var;
        String string;
        String str2;
        Context context2;
        Object obj;
        String str3;
        String str4;
        boolean zBooleanValue;
        String str5;
        Context context3;
        String str6 = str;
        if (zn2Var instanceof mc7) {
            mc7Var = (mc7) zn2Var;
            int i = mc7Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mc7Var.label = i - Integer.MIN_VALUE;
            } else {
                mc7Var = new mc7(this, zn2Var);
            }
        } else {
            mc7Var = new mc7(this, zn2Var);
        }
        Object objA = mc7Var.result;
        int i2 = mc7Var.label;
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        if (i2 == 0) {
            jzb.q(objA);
            string = context.getString(R.string.invitation_share_card_title);
            string.getClass();
            String string2 = context.getString(R.string.invitation_share_card_body);
            string2.getClass();
            str2 = string + "\n" + string2;
            if (gbdVar == gbd.e) {
                str6.getClass();
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/uri-list");
                intent.putExtra("android.intent.extra.TEXT", str2 + "\n\n" + str6);
                Intent intentCreateChooser = Intent.createChooser(intent, str2);
                intentCreateChooser.addFlags(268435456);
                context.startActivity(intentCreateChooser);
                return wefVar;
            }
            nc7 nc7Var = new nc7(context, null);
            mc7Var.L$0 = context;
            mc7Var.L$1 = gbdVar;
            mc7Var.L$2 = str6;
            mc7Var.L$3 = string;
            mc7Var.L$4 = string2;
            mc7Var.L$5 = str2;
            mc7Var.label = 1;
            Object objB = lw2.b(nc7Var, mc7Var);
            if (objB != bw2Var) {
                context2 = context;
                obj = objB;
                str3 = string2;
            }
            return bw2Var;
        }
        if (i2 == 1) {
            String str7 = (String) mc7Var.L$5;
            str3 = (String) mc7Var.L$4;
            String str8 = (String) mc7Var.L$3;
            String str9 = (String) mc7Var.L$2;
            context2 = (Context) mc7Var.L$0;
            jzb.q(objA);
            str2 = str7;
            obj = objA;
            string = str8;
            str6 = str9;
        } else {
            if (i2 != 2) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str5 = (String) mc7Var.L$5;
            str4 = (String) mc7Var.L$2;
            context3 = (Context) mc7Var.L$0;
            jzb.q(objA);
        }
        zBooleanValue = ((Boolean) objA).booleanValue();
        str2 = str5;
        context2 = context3;
        if (!zBooleanValue) {
            context2.getClass();
            str2.getClass();
            str4.getClass();
            Intent intent2 = new Intent("android.intent.action.SEND");
            intent2.setType("text/uri-list");
            intent2.putExtra("android.intent.extra.TEXT", str2 + "\n\n" + str4);
            Intent intentCreateChooser2 = Intent.createChooser(intent2, str2);
            intentCreateChooser2.addFlags(268435456);
            context2.startActivity(intentCreateChooser2);
        }
        return wefVar;
        if (((Bitmap) obj) != null) {
            mc7Var.L$0 = context2;
            mc7Var.L$1 = null;
            mc7Var.L$2 = str6;
            mc7Var.L$3 = null;
            mc7Var.L$4 = null;
            mc7Var.L$5 = str2;
            mc7Var.L$6 = null;
            mc7Var.L$7 = null;
            mc7Var.label = 2;
            this.e.getClass();
            objA = wt6.a(context2, str6, string, str3);
            if (objA != bw2Var) {
                str4 = str6;
                str5 = str2;
                context3 = context2;
                zBooleanValue = ((Boolean) objA).booleanValue();
                str2 = str5;
                context2 = context3;
            }
            return bw2Var;
        }
        str4 = str6;
        zBooleanValue = false;
        if (!zBooleanValue) {
            context2.getClass();
            str2.getClass();
            str4.getClass();
            Intent intent3 = new Intent("android.intent.action.SEND");
            intent3.setType("text/uri-list");
            intent3.putExtra("android.intent.extra.TEXT", str2 + "\n\n" + str4);
            Intent intentCreateChooser3 = Intent.createChooser(intent3, str2);
            intentCreateChooser3.addFlags(268435456);
            context2.startActivity(intentCreateChooser3);
        }
        return wefVar;
    }
}
