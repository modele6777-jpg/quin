package defpackage;

import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.draw.model.DrawCardSaves;
import android.content.Context;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ve4 implements xj5 {
    public final /* synthetic */ xj5 a;
    public final /* synthetic */ r0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ zc4 d;
    public final /* synthetic */ Context e;

    public ve4(xj5 xj5Var, r0 r0Var, String str, zc4 zc4Var, Context context) {
        this.a = xj5Var;
        this.b = r0Var;
        this.c = str;
        this.d = zc4Var;
        this.e = context;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        ue4 ue4Var;
        DrawCardSaves drawCardSaves;
        if (xn2Var instanceof ue4) {
            ue4Var = (ue4) xn2Var;
            int i = ue4Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ue4Var.label = i - Integer.MIN_VALUE;
            } else {
                ue4Var = new ue4(this, xn2Var);
            }
        } else {
            ue4Var = new ue4(this, xn2Var);
        }
        Object obj2 = ue4Var.result;
        int i2 = ue4Var.label;
        if (i2 == 0) {
            jzb.q(obj2);
            oyb oybVar = (oyb) obj;
            if (oybVar instanceof nyb) {
                e2a e2aVar = (e2a) ((nyb) oybVar).a;
                String strJ = e2aVar.b;
                List list = e2aVar.c;
                r0 r0Var = this.b;
                r0Var.d().e("Alternative pattern: " + oybVar);
                String str = this.c;
                if (strJ == null) {
                    ale.a.getClass();
                    ale aleVarH = pzd.h(str);
                    strJ = aleVarH != null ? aleVarH.j() : null;
                    if (strJ == null) {
                        strJ = pzd.g(list.size()).d();
                    }
                }
                String str2 = strJ;
                zc4 zc4Var = this.d;
                zc4 zc4VarB = zc4.b(zc4Var, str2, list, null, 121);
                r0Var.J1(null);
                drawCardSaves = (DrawCardSaves) y41.L(r0Var.y, this.e, r0Var.m0(), new jt3(9, r0Var, new zc4(zc4VarB.a, str2, list, zc4Var.d, null, null, str, 48)));
            } else {
                drawCardSaves = null;
            }
            if (drawCardSaves != null) {
                ue4Var.L$0 = null;
                ue4Var.L$1 = null;
                ue4Var.L$2 = null;
                ue4Var.L$3 = null;
                ue4Var.L$4 = null;
                ue4Var.label = 1;
                Object objA = this.a.a(drawCardSaves, ue4Var);
                bw2 bw2Var = bw2.a;
                if (objA == bw2Var) {
                    return bw2Var;
                }
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj2);
        }
        return wef.a;
    }
}
