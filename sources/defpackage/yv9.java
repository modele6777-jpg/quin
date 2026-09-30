package defpackage;

import ai.askquin.ui.conversation.r0;
import android.media.MediaPlayer;
import com.google.android.filament.Engine;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yv9 extends h36 implements x16 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yv9(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    /* JADX WARN: Code duplicated, block: B:153:0x02d8  */
    @Override // defpackage.x16
    public final Object invoke() throws Exception {
        int i;
        Type typeV;
        Object dzbVar;
        z6e z6eVar;
        String strP;
        int i2 = this.a;
        tn4 tn4Var = tn4.c;
        int i3 = 1;
        wef wefVar = wef.a;
        switch (i2) {
            case 0:
                ((r0) this.receiver).m1();
                return wefVar;
            case 1:
                ((r0) this.receiver).p1();
                return wefVar;
            case 2:
                ((r0) this.receiver).getClass();
                return wefVar;
            case 3:
                ((qna) this.receiver).e.setValue(null);
                return wefVar;
            case 4:
                soa soaVar = (soa) this.receiver;
                coa coaVar = soaVar.G0;
                MediaPlayer mediaPlayer = soaVar.Y;
                if (((Boolean) soaVar.Z.getValue()).booleanValue()) {
                    if (mediaPlayer != null) {
                        mediaPlayer.pause();
                    }
                    soaVar.i(false);
                    lyd lydVar = soaVar.F0;
                    if (lydVar != null) {
                        lydVar.h(null);
                    }
                    soaVar.F0 = null;
                } else if (mediaPlayer != null) {
                    x16 x16Var = m93.m;
                    if (x16Var != coaVar) {
                        if (x16Var != null) {
                            x16Var.invoke();
                        }
                        m93.m = coaVar;
                    }
                    mediaPlayer.start();
                    soaVar.i(true);
                    lyd lydVar2 = soaVar.F0;
                    if (lydVar2 != null) {
                        lydVar2.h(null);
                    }
                    soaVar.F0 = ynb.V(hwf.a(soaVar), null, null, new hoa(soaVar, null), 3);
                } else {
                    File file = soaVar.d.f;
                    String absolutePath = file != null ? file.getAbsolutePath() : null;
                    if (absolutePath != null) {
                        x16 x16Var2 = m93.m;
                        if (x16Var2 != coaVar) {
                            if (x16Var2 != null) {
                                x16Var2.invoke();
                            }
                            m93.m = coaVar;
                        }
                        MediaPlayer mediaPlayer2 = new MediaPlayer();
                        mediaPlayer2.setDataSource(absolutePath);
                        mediaPlayer2.setOnPreparedListener(new ce0(soaVar, i3));
                        mediaPlayer2.setOnCompletionListener(new de0(soaVar, i3));
                        mediaPlayer2.prepareAsync();
                        soaVar.Y = mediaPlayer2;
                    }
                }
                return wefVar;
            case 5:
                ((lqd) ((fqd) this.receiver)).a();
                return wefVar;
            case 6:
                xnb xnbVar = (xnb) this.receiver;
                xnbVar.getClass();
                List<aob> parameters = xnbVar.getParameters();
                int size = (xnbVar.isSuspend() ? 1 : 0) + parameters.size();
                if (parameters.isEmpty()) {
                    i = 0;
                } else {
                    i = 0;
                    for (aob aobVar : parameters) {
                        if (aobVar.t() == on7.d || aobVar.t() == on7.b) {
                            i++;
                            if (i < 0) {
                                t72.Y();
                                throw null;
                            }
                        }
                    }
                }
                int i4 = (i + 31) / 32;
                Object[] objArr = new Object[size + i4 + 1];
                for (aob aobVar2 : parameters) {
                    if (aobVar2.w() && !sqf.i(aobVar2.u())) {
                        int iM = aobVar2.m();
                        yn7 yn7VarU = aobVar2.u();
                        yn7VarU.getClass();
                        if (yn7VarU instanceof j2) {
                            fob fobVar = ((j2) yn7VarU).a;
                            typeV = fobVar != null ? (Type) fobVar.invoke() : null;
                            if (typeV == null) {
                                typeV = t72.v(yn7VarU, false);
                            }
                        } else {
                            typeV = t72.v(yn7VarU, false);
                        }
                        objArr[iM] = sqf.f(typeV);
                    } else if (aobVar2.y()) {
                        objArr[aobVar2.m()] = ynb.G(aobVar2.u());
                    }
                }
                for (int i5 = 0; i5 < i4; i5++) {
                    objArr[size + i5] = 0;
                }
                return objArr;
            case 7:
                w5c w5cVar = (w5c) this.receiver;
                qn2 qn2Var = w5cVar.a;
                if (qn2Var == null) {
                    pa7.g0("coroutineScope");
                    throw null;
                }
                jgb.I(qn2Var, null);
                w5cVar.f();
                ld5 ld5Var = w5cVar.e;
                if (ld5Var == null) {
                    pa7.g0("connectionManager");
                    throw null;
                }
                ((zj2) ld5Var.g).close();
                h9e h9eVar = (h9e) ld5Var.h;
                if (h9eVar != null) {
                    h9eVar.close();
                }
                return wefVar;
            case 8:
                ((jkc) this.receiver).p(null);
                return wefVar;
            case 9:
                ((jkc) this.receiver).v.setValue(tn4.a);
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ((jkc) this.receiver).v.setValue(tn4Var);
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                lbd lbdVar = (lbd) this.receiver;
                vz9 vz9Var = lbdVar.v;
                abd abdVar = (abd) vz9Var.getValue();
                abd abdVar2 = abd.b;
                if (abdVar != abdVar2 && ((abd) vz9Var.getValue()) != abd.c) {
                    vz9Var.setValue(abdVar2);
                    lbdVar.f(new kbd(lbdVar, null));
                }
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                fcb fcbVar = (fcb) this.receiver;
                fcbVar.getClass();
                fcbVar.a(new ybb(1, null));
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                ((gh6) this.receiver).c();
                return wefVar;
            case 14:
                ((gh6) this.receiver).c();
                return wefVar;
            case 15:
                ((gh6) this.receiver).b(hh6.b);
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return Boolean.valueOf(((AtomicBoolean) this.receiver).get());
            case 17:
                ((xhd) this.receiver).getClass();
                try {
                    dzbVar = (p5a) ((nfc) lr7.j().c.e).d(job.a.b(p5a.class), null);
                    break;
                } catch (Throwable th) {
                    dzbVar = new dzb(th);
                }
                p5a p5aVar = (p5a) (dzbVar instanceof dzb ? null : dzbVar);
                l1f l1fVar = new l1f();
                if (p5aVar != null) {
                    if9.o(l1fVar, p5aVar);
                    String strB0 = pa7.b0(4, ((u5a) p5aVar).a("reading-pack-test-202609"), true);
                    if (strB0 != null) {
                        l1fVar.a(strB0, "reading_pack_test_group");
                    }
                }
                LinkedHashMap linkedHashMap = l1fVar.a;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(bm8.F(linkedHashMap.size()));
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue().toString());
                }
                return linkedHashMap2;
            case 18:
                and andVar = (and) this.receiver;
                boolean zQ = andVar.q();
                vz9 vz9Var2 = andVar.X0;
                if (!zQ && !((Boolean) vz9Var2.getValue()).booleanValue() && andVar.S()) {
                    if (!andVar.Y0.isEmpty() || andVar.Z0) {
                        vz9Var2.setValue(Boolean.TRUE);
                        ynb.V(hwf.a(andVar), null, null, new umd(andVar, null), 3);
                    } else {
                        andVar.I();
                    }
                }
                return wefVar;
            case 19:
                ((and) this.receiver).a0(null);
                return wefVar;
            case 20:
                and andVar2 = (and) this.receiver;
                if (!andVar2.Q() && (z6eVar = andVar2.d1) != null) {
                    andVar2.O();
                    andVar2.Y(z6eVar);
                }
                return wefVar;
            case 21:
                ((Engine) this.receiver).w();
                return wefVar;
            case 22:
                ((rcf) this.receiver).m();
                return wefVar;
            case 23:
                ((rcf) this.receiver).v.setValue(tn4Var);
                return wefVar;
            case 24:
                return ((rcf) this.receiver).n();
            case 25:
                ((rcf) this.receiver).v.setValue(tn4Var);
                return wefVar;
            case 26:
                ((rcf) this.receiver).p(null);
                return wefVar;
            case 27:
                ((rcf) this.receiver).m();
                return wefVar;
            case 28:
                mhf mhfVar = (mhf) this.receiver;
                mhfVar.getClass();
                mhf.Q(mhfVar, "paywall_action", "view_all_plans", null, 4);
                return wefVar;
            default:
                mhf mhfVar2 = (mhf) this.receiver;
                jhf jhfVar = (jhf) mhfVar2.S0.getValue();
                bwa bwaVar = jhfVar.b;
                if (bwaVar != null && !jhfVar.c && !jhfVar.d && !mhfVar2.q() && !jhfVar.f && jhfVar.a.contains(bwaVar)) {
                    if (bwaVar instanceof n07) {
                        strP = thb.a.a();
                    } else {
                        if (!(bwaVar instanceof z6e)) {
                            ap.c();
                            return null;
                        }
                        strP = ym8.P(bwaVar);
                    }
                    String str = strP;
                    x1f x1fVar = x1f.a;
                    x1f.k(new r05("paywall_action"), new wca(mhfVar2, "paywall_action", "tap_subscribe", str, 8), 2);
                }
                return wefVar;
        }
    }
}
