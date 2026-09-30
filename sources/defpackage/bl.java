package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.conversation.r0;
import android.graphics.Rect;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bl implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ bl(z6g z6gVar, int i, e89 e89Var, s69 s69Var) {
        this.a = 4;
        this.c = z6gVar;
        this.b = i;
        this.d = e89Var;
        this.e = s69Var;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00c0  */
    @Override // defpackage.x16
    public final Object invoke() {
        String strA;
        int iL;
        int i = this.a;
        wef wefVar = wef.a;
        Object obj = this.e;
        int i2 = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                r0 r0Var = (r0) obj3;
                ale aleVar = (ale) obj2;
                kzd kzdVar = (kzd) obj;
                if (aleVar != null) {
                    z67 z67Var = ywd.a;
                    strA = "preset";
                } else {
                    strA = ywd.b(i2).a();
                }
                r0Var.e1(strA);
                kzdVar.getClass();
                ynb.V(hwf.a(kzdVar.b), null, null, new hzd(kzdVar, aleVar != null ? aleVar.getId() : null, null), 3);
                return wefVar;
            case 1:
                cs3 cs3Var = (cs3) obj3;
                x16 x16Var = (x16) obj2;
                aw2 aw2Var = (aw2) obj;
                if (i2 == ((sz9) cs3Var.d.c).j()) {
                    x16Var.invoke();
                } else {
                    ynb.V(aw2Var, null, null, new vj3(cs3Var, i2, null), 3);
                }
                return wefVar;
            case 2:
                e89 e89Var = (e89) obj3;
                TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) obj2;
                e89 e89Var2 = (e89) obj;
                dwf dwfVar = (dwf) e89Var.getValue();
                dwf dwfVar2 = dwf.a;
                boolean z = dwfVar == dwfVar2;
                x1f x1fVar = x1f.a;
                x1f.k(p05.a, new bs0(z, tarotSkinIdentify, 5), 2);
                if (z) {
                    e89Var2.setValue(nk8.s(i2));
                }
                if (z) {
                    dwfVar2 = dwf.b;
                }
                e89Var.setValue(dwfVar2);
                return wefVar;
            case 3:
                gh6 gh6Var = (gh6) obj3;
                a26 a26Var = (a26) obj2;
                if (i2 != ((sz9) ((s69) obj)).j()) {
                    gh6Var.b(hh6.d);
                }
                a26Var.d(Integer.valueOf(i2 + 1));
                return wefVar;
            case 4:
                s69 s69Var = (s69) obj;
                View view = ((z6g) obj3).a;
                Rect rect = new Rect();
                view.getWindowVisibleDisplayFrame(rect);
                int i3 = rect.top;
                int i4 = rect.bottom;
                bv7 bv7Var = (bv7) ((e89) obj2).getValue();
                hkb hkbVarG = (bv7Var == null || !bv7Var.h()) ? hkb.e : z5c.g(bv7Var.c(0L), db6.Y0(bv7Var.l()));
                int i5 = i3 + i2;
                int i6 = i4 - i2;
                float f = hkbVarG.b;
                if (f <= i4) {
                    float f2 = hkbVarG.d;
                    if (f2 < i3) {
                        iL = i6 - i5;
                    } else {
                        iL = ym8.L(Math.max(f - i5, i6 - f2));
                    }
                } else {
                    iL = i6 - i5;
                }
                ((sz9) s69Var).k(Math.max(iL, 0));
                return wefVar;
            case 5:
                StringBuilder sbP = tec.p("Can not interpret the string '", (String) obj3, "' as ");
                sbP.append(((bk9) ((fk9) obj2).a.get(i2)).b);
                sbP.append(": ");
                sbP.append(((dk9) obj).w());
                return sbP.toString();
            default:
                return "Expected " + ((r4e) obj3).b + " but got " + ((CharSequence) obj2).subSequence(i2, ((kmb) obj).element).toString();
        }
    }

    public /* synthetic */ bl(int i, Object obj, Object obj2, Object obj3, int i2) {
        this.a = i2;
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ bl(Object obj, Object obj2, int i, Object obj3, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
        this.e = obj3;
    }
}
