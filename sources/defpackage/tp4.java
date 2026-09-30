package defpackage;

import ai.askquin.ui.share.SharePayload$DrawnCards;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tp4 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SharePayload$DrawnCards b;
    public final /* synthetic */ a26 c;
    public final /* synthetic */ int d;

    public /* synthetic */ tp4(SharePayload$DrawnCards sharePayload$DrawnCards, a26 a26Var, int i, int i2) {
        this.a = i2;
        this.b = sharePayload$DrawnCards;
        this.c = a26Var;
        this.d = i;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.d;
        a26 a26Var = this.c;
        SharePayload$DrawnCards sharePayload$DrawnCards = this.b;
        l46 l46Var = (l46) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                g21.h(sharePayload$DrawnCards, a26Var, l46Var, k99.P(i2 | 1));
                break;
            default:
                g21.j(sharePayload$DrawnCards, a26Var, l46Var, k99.P(i2 | 1));
                break;
        }
        return wefVar;
    }
}
