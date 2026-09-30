package defpackage;

import ai.askquin.R;
import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.draw.model.DrawCardSaves;
import ai.askquin.ui.share.ShareActivity;
import android.content.Context;
import java.util.List;
import tech.chatmind.api.PatternData;
import tech.chatmind.api.TarotCardChoice;
import tech.chatmind.api.events.model.Popup;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h20 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ h20(rcf rcfVar, Context context, r0 r0Var, TarotSkinIdentify tarotSkinIdentify, boolean z) {
        this.a = 5;
        this.e = rcfVar;
        this.f = context;
        this.c = r0Var;
        this.d = tarotSkinIdentify;
        this.b = z;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        Object objB = null;
        wef wefVar = wef.a;
        boolean z = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (i) {
            case 0:
                n07 n07Var = (n07) obj4;
                a26 a26Var = (a26) obj3;
                e89 e89Var = (e89) obj2;
                e89 e89Var2 = (e89) obj;
                if (!z) {
                    e89Var.setValue(new j20(n07Var, a26Var, 0));
                    e89Var2.setValue(Boolean.TRUE);
                } else if (n07Var != null) {
                    a26Var.d(n07Var);
                } else {
                    jcc.k(1, Integer.valueOf(R.string.chat_mind_pricing_loading_failed));
                }
                return wefVar;
            case 1:
                x16 x16Var = (x16) obj3;
                e89 e89Var3 = (e89) obj2;
                e89 e89Var4 = (e89) obj;
                if (((Popup) obj4).getCanClose() && z && !((Boolean) e89Var3.getValue()).booleanValue()) {
                    e89Var3.setValue(Boolean.TRUE);
                    e89Var4.setValue(Boolean.FALSE);
                    x16Var.invoke();
                }
                return wefVar;
            case 2:
                l26 l26Var = (l26) obj4;
                TarotCardChoice tarotCardChoice = (TarotCardChoice) obj2;
                cxe cxeVar = (cxe) obj;
                a26 a26Var2 = (a26) obj3;
                if (z) {
                    bv7 bv7Var = cxeVar.a[0];
                    if (bv7Var != null) {
                        if (!bv7Var.h()) {
                            bv7Var = null;
                        }
                        if (bv7Var != null) {
                            objB = vt1.b(bv7Var, false);
                        }
                    }
                    l26Var.z(tarotCardChoice, objB);
                } else {
                    a26Var2.d(tarotCardChoice);
                }
                return wefVar;
            case 3:
                x16 x16Var2 = (x16) obj4;
                String str = (String) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                if (z) {
                    x1f x1fVar = x1f.a;
                    x1f.k(p05.a, new bv9(str, str2, str3, 8), 2);
                }
                x16Var2.invoke();
                return wefVar;
            case 4:
                return new ted(this.b, (x16) obj4, (x16) obj2, (ued) obj, (a26) obj3);
            default:
                Context context = (Context) obj3;
                r0 r0Var = (r0) obj2;
                TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) obj;
                DrawCardSaves drawCardSavesO = ((rcf) obj4).o();
                int i2 = ShareActivity.T0;
                String chatId = drawCardSavesO.getChatId();
                List<TarotCardChoice> choices = drawCardSavesO.getChoices();
                List<PatternData> patterns = drawCardSavesO.getPatterns();
                if (r0Var != null) {
                    objB = r0Var.H() != null ? r0Var.C1 : null;
                    if (objB == null) {
                        objB = tarotSkinIdentify.getKey().name();
                    }
                } else {
                    objB = tarotSkinIdentify.getKey().name();
                }
                jy4.z(context, chatId, choices, patterns, objB, z ? "scene" : "reading_general", drawCardSavesO.getMixedDeck());
                return wefVar;
        }
    }

    public /* synthetic */ h20(Object obj, Object obj2, Object obj3, Object obj4, boolean z, int i) {
        this.a = i;
        this.b = z;
        this.e = obj;
        this.f = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public /* synthetic */ h20(Popup popup, boolean z, x16 x16Var, e89 e89Var, e89 e89Var2) {
        this.a = 1;
        this.e = popup;
        this.b = z;
        this.f = x16Var;
        this.c = e89Var;
        this.d = e89Var2;
    }

    public /* synthetic */ h20(boolean z, m26 m26Var, Object obj, Object obj2, a26 a26Var, int i) {
        this.a = i;
        this.b = z;
        this.e = m26Var;
        this.c = obj;
        this.d = obj2;
        this.f = a26Var;
    }
}
