package defpackage;

import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.draw.mixed.MixedDeckSnapshot;
import ai.askquin.ui.draw.navhost.UnifiedDrawingRoute;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ko4 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rcf b;
    public final /* synthetic */ r0 c;
    public final /* synthetic */ UnifiedDrawingRoute d;
    public final /* synthetic */ fcb e;
    public final /* synthetic */ ka9 f;
    public final /* synthetic */ fo4 g;
    public final /* synthetic */ e89 v;

    public /* synthetic */ ko4(rcf rcfVar, r0 r0Var, UnifiedDrawingRoute unifiedDrawingRoute, fcb fcbVar, ka9 ka9Var, fo4 fo4Var, e89 e89Var, int i) {
        this.a = i;
        this.b = rcfVar;
        this.c = r0Var;
        this.d = unifiedDrawingRoute;
        this.e = fcbVar;
        this.f = ka9Var;
        this.g = fo4Var;
        this.v = e89Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        i8c i8cVar;
        ym7 ym7Var;
        i8c i8cVar2;
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    rcf rcfVar = this.b;
                    rx8.a(48, af1.b0(1355715514, new ko4(rcfVar, this.c, this.d, this.e, this.f, this.g, this.v, 1), l46Var), l46Var, ((MixedDeckSnapshot) rcfVar.c.getValue()) != null);
                }
                break;
            default:
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!l46Var2.W(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    l46Var2.Z();
                } else {
                    r0 r0Var = this.c;
                    az1 az1VarC = r0Var.C();
                    UnifiedDrawingRoute unifiedDrawingRoute = this.d;
                    boolean zIsSceneDivination = unifiedDrawingRoute.isSceneDivination();
                    boolean zIsQuickDraw = unifiedDrawingRoute.isQuickDraw();
                    boolean zR0 = r0Var.r0();
                    boolean zG0 = r0Var.g0();
                    a26 a26Var = null;
                    i8c i8cVar3 = sf2.a;
                    if (zG0) {
                        l46Var2.f0(-1751134180);
                        boolean zI = l46Var2.i(r0Var);
                        Object objR = l46Var2.R();
                        if (zI || objR == i8cVar3) {
                            i8cVar = i8cVar3;
                            gl glVar = new gl(2, r0Var, r0.class, "onDrawBeforeQuestionCompleted", "onDrawBeforeQuestionCompleted(Lai/askquin/ui/draw/model/DrawCardSaves;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 12);
                            l46Var2.p0(glVar);
                            objR = glVar;
                        } else {
                            i8cVar = i8cVar3;
                        }
                        ym7Var = (ym7) objR;
                        l46Var2.r(false);
                    } else {
                        i8cVar = i8cVar3;
                        l46Var2.f0(-1751055069);
                        l46Var2.r(false);
                        ym7Var = null;
                    }
                    l26 l26Var = (l26) ym7Var;
                    boolean zF0 = r0Var.f0();
                    String strG = r0Var.G();
                    fcb fcbVar = this.e;
                    boolean zI2 = l46Var2.i(fcbVar) | l46Var2.i(r0Var);
                    ka9 ka9Var = this.f;
                    boolean zI3 = zI2 | l46Var2.i(ka9Var);
                    fo4 fo4Var = this.g;
                    boolean zI4 = zI3 | l46Var2.i(fo4Var);
                    Object objR2 = l46Var2.R();
                    if (zI4) {
                        i8cVar2 = i8cVar;
                        wg wgVar = new wg(fcbVar, r0Var, ka9Var, fo4Var, 13);
                        l46Var2.p0(wgVar);
                        objR2 = wgVar;
                    } else {
                        i8c i8cVar4 = i8cVar;
                        if (objR2 == i8cVar4) {
                            i8cVar = i8cVar4;
                            i8cVar2 = i8cVar;
                            wg wgVar2 = new wg(fcbVar, r0Var, ka9Var, fo4Var, 13);
                            l46Var2.p0(wgVar2);
                            objR2 = wgVar2;
                        } else {
                            i8cVar2 = i8cVar4;
                        }
                    }
                    a26 a26Var2 = (a26) objR2;
                    if (r0Var.g0()) {
                        l46Var2.f0(-1750230717);
                        l46Var2.r(false);
                    } else {
                        l46Var2.f0(-1750401123);
                        boolean zI5 = l46Var2.i(fcbVar) | l46Var2.i(r0Var) | l46Var2.i(ka9Var);
                        Object objR3 = l46Var2.R();
                        if (zI5 || objR3 == i8cVar2) {
                            objR3 = new it3(fcbVar, r0Var, ka9Var, 6);
                            l46Var2.p0(objR3);
                        }
                        a26Var = (a26) objR3;
                        l46Var2.r(false);
                    }
                    rcf rcfVar2 = this.b;
                    boolean zI6 = l46Var2.i(rcfVar2);
                    Object objR4 = l46Var2.R();
                    if (zI6 || objR4 == i8cVar2) {
                        objR4 = new jt3(14, rcfVar2, this.v);
                        l46Var2.p0(objR4);
                    }
                    int i2 = rcf.x;
                    int i3 = r0.j2;
                    hcc.d(rcfVar2, r0Var, az1VarC, zIsSceneDivination, zIsQuickDraw, zR0, l26Var, zF0, strG, a26Var2, a26Var, (x16) objR4, l46Var2, 72);
                }
                break;
        }
        return wefVar;
    }
}
