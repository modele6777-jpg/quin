package defpackage;

import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hca implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j09 b;
    public final /* synthetic */ TarotCardChoice c;
    public final /* synthetic */ TarotCardChoice d;

    public /* synthetic */ hca(j09 j09Var, TarotCardChoice tarotCardChoice, TarotCardChoice tarotCardChoice2, int i, int i2) {
        this.a = i2;
        this.b = j09Var;
        this.c = tarotCardChoice;
        this.d = tarotCardChoice2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        TarotCardChoice tarotCardChoice = this.d;
        TarotCardChoice tarotCardChoice2 = this.c;
        j09 j09Var = this.b;
        l46 l46Var = (l46) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                rxg.v(j09Var, tarotCardChoice2, tarotCardChoice, l46Var, k99.P(1));
                break;
            default:
                ksb.b(j09Var, tarotCardChoice2, tarotCardChoice, l46Var, k99.P(7));
                break;
        }
        return wefVar;
    }
}
