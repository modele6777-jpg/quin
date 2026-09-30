package defpackage;

import android.content.Context;
import tech.chatmind.api.giftcard.GiftCardSku;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o96 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ s76 c;

    public /* synthetic */ o96(Context context, s76 s76Var, int i) {
        this.a = i;
        this.b = context;
        this.c = s76Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        s76 s76Var = this.c;
        Context context = this.b;
        String str = (String) obj;
        GiftCardSku giftCardSku = (GiftCardSku) obj2;
        switch (i) {
            case 0:
                str.getClass();
                giftCardSku.getClass();
                pa6.t(context, str, s76Var);
                break;
            default:
                str.getClass();
                giftCardSku.getClass();
                pa6.t(context, str, s76Var);
                break;
        }
        return wefVar;
    }
}
