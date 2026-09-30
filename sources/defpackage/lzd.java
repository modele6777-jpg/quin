package defpackage;

import ai.askquin.ui.conversation.DrawCardAnswer;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lzd extends gbe implements l26 {
    final /* synthetic */ ka9 $navController;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lzd(ka9 ka9Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$navController = ka9Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new lzd(this.$navController, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        ycc yccVarA;
        ycc yccVarA2;
        DrawCardAnswer drawCardAnswer = null;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        da9 da9VarH = this.$navController.b.h();
        String str = (da9VarH == null || (yccVarA2 = da9VarH.a()) == null) ? null : (String) yccVarA2.a("drawCardAnswer");
        if (str != null) {
            try {
                drawCardAnswer = (DrawCardAnswer) fzc.a.b(DrawCardAnswer.Companion.serializer(), str);
            } catch (Exception e) {
                hf8.Q.getClass();
                ef8.a("StartDrawCardHelper").c("Failed to decode drawCardAnswer: ".concat(str), e);
            }
        }
        if (drawCardAnswer != null) {
            da9 da9VarH2 = this.$navController.b.h();
            if (da9VarH2 != null && (yccVarA = da9VarH2.a()) != null) {
            }
            hf8.Q.getClass();
            ef8.a("StartDrawCardHelper").e("recheck: " + drawCardAnswer);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        lzd lzdVar = (lzd) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        lzdVar.r(wefVar);
        return wefVar;
    }
}
