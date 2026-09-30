package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.ui.node.Owner;
import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dx implements x16 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ dx(aw2 aw2Var, TarotSkinIdentify tarotSkinIdentify, TarotCardType tarotCardType, ghc ghcVar, tt1 tt1Var, int i) {
        this.c = aw2Var;
        this.d = tarotSkinIdentify;
        this.e = tarotCardType;
        this.f = ghcVar;
        this.g = tt1Var;
        this.b = i;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        Object obj = this.g;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                KeyEvent.Callback callback = (View) obj;
                callback.getClass();
                return new uvf((Context) obj5, (a26) obj4, (j46) obj3, (ucc) obj2, this.b, (Owner) callback).getLayoutNode();
            default:
                TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) obj4;
                TarotCardType tarotCardType = (TarotCardType) obj3;
                x1f x1fVar = x1f.a;
                x1f.k(p05.a, new l0(27, tarotSkinIdentify, tarotCardType), 2);
                ynb.V((aw2) obj5, null, null, new nq1((ghc) obj2, tarotCardType, (tt1) obj, tarotSkinIdentify, this.b, null), 3);
                return wef.a;
        }
    }

    public /* synthetic */ dx(Context context, a26 a26Var, j46 j46Var, ucc uccVar, int i, View view) {
        this.c = context;
        this.d = a26Var;
        this.e = j46Var;
        this.f = uccVar;
        this.b = i;
        this.g = view;
    }
}
