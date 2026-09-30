package ai.askquin.ui.conversation;

import ai.askquin.ui.conversation.dialogue.ClarifyingCardState;
import defpackage.ap;
import defpackage.bw2;
import defpackage.cp5;
import defpackage.et8;
import defpackage.ft8;
import defpackage.gbe;
import defpackage.gt8;
import defpackage.iy9;
import defpackage.jsd;
import defpackage.jyb;
import defpackage.jzb;
import defpackage.kyb;
import defpackage.l26;
import defpackage.lp5;
import defpackage.lsd;
import defpackage.lyb;
import defpackage.m8b;
import defpackage.mp5;
import defpackage.myb;
import defpackage.np5;
import defpackage.nyb;
import defpackage.op5;
import defpackage.ot8;
import defpackage.oyb;
import defpackage.pa7;
import defpackage.pu4;
import defpackage.qc0;
import defpackage.ql6;
import defpackage.rab;
import defpackage.s12;
import defpackage.t12;
import defpackage.ub3;
import defpackage.v4e;
import defpackage.wef;
import defpackage.xn2;
import defpackage.zf4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import tech.chatmind.api.ChatTextMessage;
import tech.chatmind.api.TarotReadingChatState;
import tech.chatmind.api.TarotReadingHistory;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends gbe implements l26 {
    final /* synthetic */ String $requestMessageId;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ r0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(r0 r0Var, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = r0Var;
        this.$requestMessageId = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        p0 p0Var = new p0(this.this$0, this.$requestMessageId, xn2Var);
        p0Var.L$0 = obj;
        return p0Var;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0159 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x015b  */
    /* JADX WARN: Code duplicated, block: B:76:0x015e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0161  */
    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        ft8 ft8Var;
        TarotReadingChatState chat;
        oyb oybVar = (oyb) this.L$0;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            if (oybVar instanceof lyb) {
                this.this$0.T0.put(this.$requestMessageId, ClarifyingCardDrawActionState.Loading.INSTANCE);
            } else {
                boolean z = oybVar instanceof myb;
                s12 s12Var = s12.b;
                if (z) {
                    r0 r0Var = this.this$0;
                    String str = this.$requestMessageId;
                    op5 op5Var = (op5) ((myb) oybVar).a;
                    int i2 = r0.j2;
                    r0Var.getClass();
                    if (op5Var instanceof np5) {
                        String str2 = ((np5) op5Var).a;
                        if (!v4e.Q(str2)) {
                            r0Var.U0.put(str, s12Var);
                            r0Var.Q1(str);
                        }
                        t12 t12Var = (t12) r0Var.P().b.get(str);
                        ft8 ft8Var2 = t12Var != null ? t12Var.b : null;
                        if (ft8Var2 == null || v4e.Q(str2)) {
                            r0Var.X0(new et8(r0.m(str), str2, false));
                        } else {
                            r0Var.X0(new gt8(r0.m(str), str2, ft8Var2.a, str));
                        }
                    } else if (op5Var instanceof mp5) {
                        m8b m8bVar = cp5.a;
                        ot8 ot8VarB = cp5.b(((mp5) op5Var).a);
                        if (ot8VarB != null) {
                            if ((ot8VarB instanceof gt8) && pa7.t(((gt8) ot8VarB).d, str)) {
                                r0Var.Q1(str);
                                r0Var.x(r0.m(str));
                            }
                            r0Var.X0(ot8VarB);
                        }
                    } else if (!(op5Var instanceof lp5)) {
                        ap.c();
                        return null;
                    }
                } else if (oybVar instanceof nyb) {
                    r0 r0Var2 = this.this$0;
                    String str3 = this.$requestMessageId;
                    op5 op5Var2 = (op5) ((nyb) oybVar).a;
                    int i3 = r0.j2;
                    lsd lsdVar = r0Var2.U0;
                    jsd jsdVar = r0Var2.R0;
                    if (op5Var2 instanceof lp5) {
                        lp5 lp5Var = (lp5) op5Var2;
                        TarotReadingHistory tarotReadingHistory = lp5Var.b;
                        String str4 = lp5Var.a;
                        List<ChatTextMessage> messages = (tarotReadingHistory == null || (chat = tarotReadingHistory.getChat()) == null) ? null : chat.getMessages();
                        if (messages == null) {
                            messages = pu4.a;
                        }
                        if (messages.isEmpty()) {
                            r0Var2.x(r0.m(str3));
                            t12 t12Var2 = (t12) r0Var2.P().b.get(str3);
                            ArrayList arrayList = new ArrayList();
                            ListIterator listIterator = jsdVar.listIterator();
                            while (true) {
                                ql6 ql6Var = (ql6) listIterator;
                                if (!ql6Var.hasNext()) {
                                    break;
                                }
                                Object next = ql6Var.next();
                                if (next instanceof gt8) {
                                    arrayList.add(next);
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                Iterator it = arrayList.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (pa7.t(((gt8) it.next()).d, str3)) {
                                        }
                                    } else if (!v4e.Q(str4)) {
                                        if (t12Var2 != null) {
                                            ft8Var = t12Var2.b;
                                        } else {
                                            ft8Var = null;
                                        }
                                        if (ft8Var != null) {
                                            r0Var2.X0(new gt8(ub3.i("clarifying-interpretation-local:", str3), str4, t12Var2.b.a, str3));
                                        }
                                    }
                                }
                            } else if (!v4e.Q(str4)) {
                                if (t12Var2 != null) {
                                    ft8Var = t12Var2.b;
                                } else {
                                    ft8Var = null;
                                }
                                if (ft8Var != null) {
                                    r0Var2.X0(new gt8(ub3.i("clarifying-interpretation-local:", str3), str4, t12Var2.b.a, str3));
                                }
                            }
                            r0Var2.q1();
                        } else {
                            r0Var2.i(messages);
                        }
                        ArrayList arrayList2 = new ArrayList();
                        ListIterator listIterator2 = jsdVar.listIterator();
                        while (true) {
                            ql6 ql6Var2 = (ql6) listIterator2;
                            if (!ql6Var2.hasNext()) {
                                break;
                            }
                            Object next2 = ql6Var2.next();
                            if (next2 instanceof gt8) {
                                arrayList2.add(next2);
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            Iterator it2 = arrayList2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (pa7.t(((gt8) it2.next()).d, str3)) {
                                    }
                                } else if (!v4e.Q(str4)) {
                                }
                                r0Var2.Q1(str3);
                            }
                        } else if (!v4e.Q(str4)) {
                            r0Var2.Q1(str3);
                        }
                        r0Var2.N0(tarotReadingHistory);
                        r0Var2.T0.remove(str3);
                        t12 t12Var3 = (t12) r0Var2.P().b.get(str3);
                        ClarifyingCardState clarifyingCardState = t12Var3 != null ? t12Var3.d : null;
                        if (clarifyingCardState == ClarifyingCardState.Completed || clarifyingCardState == ClarifyingCardState.Interpreting) {
                            lsdVar.remove(str3);
                            r0Var2.V0.remove(str3);
                        } else {
                            lsdVar.put(str3, s12Var);
                        }
                        r0Var2.q1();
                    }
                } else if (oybVar instanceof kyb) {
                    kyb kybVar = (kyb) oybVar;
                    Throwable th = kybVar.a;
                    boolean zB = zf4.b(th);
                    r0 r0Var3 = this.this$0;
                    String str5 = this.$requestMessageId;
                    if (zB) {
                        this.L$0 = null;
                        this.label = 1;
                        int i4 = r0.j2;
                        Object objZ0 = r0Var3.Z0(str5, false, this);
                        bw2 bw2Var = bw2.a;
                        if (objZ0 == bw2Var) {
                            return bw2Var;
                        }
                    } else {
                        int i5 = r0.j2;
                        r0Var3.getClass();
                        iy9 iy9VarK = r0.K(kybVar);
                        FailReason failReason = (FailReason) iy9VarK.a();
                        String str6 = (String) iy9VarK.b();
                        r0Var3.d().c("Draw clarifying card failed: requestId=" + str5 + ", reason=" + failReason + ", body=" + str6, th);
                        if (pa7.t(failReason, FailReason.Unauthorized.INSTANCE)) {
                            ((rab) r0Var3.v).g(true);
                        }
                        r0Var3.x(r0.m(str5));
                        r0Var3.U0.put(str5, s12.a);
                        r0Var3.T0.put(str5, new ClarifyingCardDrawActionState.Failed(failReason));
                        if (failReason instanceof FailReason.UsageBlocked) {
                            r0Var3.W0.i(((FailReason.UsageBlocked) failReason).getReason());
                        }
                        r0Var3.q1();
                    }
                } else if (!(oybVar instanceof jyb)) {
                    ap.c();
                    return null;
                }
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((p0) k((xn2) obj2, (oyb) obj)).r(wef.a);
    }
}
