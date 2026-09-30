package defpackage;

import ai.askquin.data.SeasonalDraftStore$Draft;
import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.fourseasons.SeasonalPhysicalDrawRoute;
import ai.askquin.ui.fourseasons.SeasonalQuestionRoute;
import ai.askquin.ui.fourseasons.SeasonalRelationshipRoute;
import ai.askquin.ui.fourseasons.SeasonalRoleRoute;
import ai.askquin.ui.fourseasons.SeasonalSpreadEntry;
import ai.askquin.ui.fourseasons.SeasonalSpreadRoute;
import android.content.Context;
import com.google.android.filament.Engine;
import java.util.Iterator;
import java.util.List;
import tech.chatmind.api.AdditionalInfoAudio;
import tech.chatmind.api.TarotCardChoice;
import tech.chatmind.api.seasonal.model.SolarTerm;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nt5 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ nt5(mhf mhfVar, boolean z, x16 x16Var, e89 e89Var) {
        this.a = 8;
        this.d = mhfVar;
        this.b = z;
        this.c = x16Var;
        this.e = e89Var;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0265  */
    /* JADX WARN: Code duplicated, block: B:107:0x026b  */
    /* JADX WARN: Code duplicated, block: B:109:0x0271  */
    /* JADX WARN: Code duplicated, block: B:112:0x027c  */
    /* JADX WARN: Code duplicated, block: B:115:0x0287  */
    @Override // defpackage.x16
    public final Object invoke() {
        lsc lscVar;
        TarotSkinIdentify tarotSkinIdentify;
        hhe hheVarA;
        int i = 0;
        int i2 = 1;
        xfe xfeVar = null;
        switch (this.a) {
            case 0:
                boolean z = this.b;
                x16 x16Var = (x16) this.c;
                String str = (String) this.d;
                e89 e89Var = (e89) this.e;
                if (z) {
                    x1f x1fVar = x1f.a;
                    x1f.k(p05.a, new bt5(str, i), 2);
                }
                e89Var.setValue(Boolean.FALSE);
                x16Var.invoke();
                break;
            case 1:
                xqc xqcVar = (xqc) this.c;
                yic yicVar = (yic) this.d;
                ka9 ka9Var = (ka9) this.e;
                boolean z2 = this.b;
                xqcVar.getClass();
                if (xqcVar.i(yicVar) && (lscVar = (lsc) xqcVar.d.getValue()) != null) {
                    mic micVar = lscVar.e;
                    SeasonalSpreadEntry.Companion.getClass();
                    micVar.getClass();
                    yic yicVarC = rmc.c(micVar);
                    SeasonalSpreadEntry seasonalSpreadEntry = new SeasonalSpreadEntry(yicVarC.a, yicVarC.b.getWireValue(), z2);
                    SeasonalDraftStore$Draft seasonalDraftStore$DraftB = xqcVar.b.b(micVar.b(), micVar.c().getWireValue());
                    ka9.e(ka9Var, seasonalSpreadEntry, null, 6);
                    if (seasonalDraftStore$DraftB != null && !seasonalDraftStore$DraftB.isEmpty()) {
                        List<TarotCardChoice> physicalSlots = seasonalDraftStore$DraftB.getPhysicalSlots();
                        if (physicalSlots == null || !physicalSlots.isEmpty()) {
                            Iterator<T> it = physicalSlots.iterator();
                            while (it.hasNext()) {
                                if (((TarotCardChoice) it.next()) != null) {
                                    ka9.e(ka9Var, SeasonalPhysicalDrawRoute.INSTANCE, null, 6);
                                }
                            }
                            if (seasonalDraftStore$DraftB.getVirtualChoices().isEmpty()) {
                                if (xqcVar.f() >= 1) {
                                    ka9.e(ka9Var, SeasonalRoleRoute.INSTANCE, null, 6);
                                }
                                if (xqcVar.f() >= 2) {
                                    ka9.e(ka9Var, SeasonalRelationshipRoute.INSTANCE, null, 6);
                                }
                                if (xqcVar.f() >= 3) {
                                    ka9.e(ka9Var, SeasonalQuestionRoute.INSTANCE, null, 6);
                                }
                            } else {
                                ka9.e(ka9Var, SeasonalSpreadRoute.INSTANCE, null, 6);
                            }
                        } else if (seasonalDraftStore$DraftB.getVirtualChoices().isEmpty()) {
                            ka9.e(ka9Var, SeasonalSpreadRoute.INSTANCE, null, 6);
                        } else {
                            if (xqcVar.f() >= 1) {
                                ka9.e(ka9Var, SeasonalRoleRoute.INSTANCE, null, 6);
                            }
                            if (xqcVar.f() >= 2) {
                                ka9.e(ka9Var, SeasonalRelationshipRoute.INSTANCE, null, 6);
                            }
                            if (xqcVar.f() >= 3) {
                                ka9.e(ka9Var, SeasonalQuestionRoute.INSTANCE, null, 6);
                            }
                        }
                    }
                }
                break;
            case 2:
                e89 e89Var2 = (e89) this.e;
                boolean z3 = this.b;
                a26 a26Var = (a26) this.c;
                e89 e89Var3 = (e89) this.d;
                puc pucVar = (puc) e89Var2.getValue();
                if (pucVar != null) {
                    if (z3) {
                        a26Var.d(pucVar.a());
                    } else {
                        e89Var3.setValue(Boolean.TRUE);
                    }
                }
                break;
            case 3:
                ynb.V((aw2) this.c, null, null, new w4a(this.b, (dc9) this.d, (cb9) this.e, null), 3);
                break;
            case 4:
                boolean z4 = this.b;
                soa soaVar = (soa) this.c;
                l26 l26Var = (l26) this.d;
                az1 az1Var = (az1) this.e;
                x1f x1fVar2 = x1f.a;
                x1f.k(p05.a, new xna(az1Var, i), 2);
                if (z4) {
                    AdditionalInfoAudio additionalInfoAudio = (AdditionalInfoAudio) soaVar.X.getValue();
                    if (additionalInfoAudio != null) {
                        l26Var.z(null, additionalInfoAudio);
                    }
                } else {
                    l26Var.z(v4e.o0(soaVar.f.d().c.toString()).toString(), null);
                }
                break;
            case 5:
                kn2 kn2Var = (kn2) this.d;
                boolean z5 = this.b;
                gh6 gh6Var = (gh6) this.e;
                x16 x16Var2 = (x16) this.c;
                if (!pa7.t(kn2Var, ed.E0)) {
                    if (z5) {
                        gh6Var.c();
                    }
                    x16Var2.invoke();
                }
                break;
            case 6:
                boolean z6 = this.b;
                SolarTerm solarTerm = (SolarTerm) this.c;
                String str2 = (String) this.d;
                e89 e89Var4 = (e89) this.e;
                if (z6) {
                    x1f x1fVar3 = x1f.a;
                    x1f.k(p05.a, new xkc(i2, solarTerm, str2), 2);
                }
                e89Var4.setValue(Boolean.TRUE);
                break;
            case 7:
                zge zgeVar = (zge) this.c;
                ihe iheVar = (ihe) this.d;
                TarotSkinIdentify tarotSkinIdentify2 = (TarotSkinIdentify) this.e;
                boolean z7 = this.b;
                if (!iheVar.g && !iheVar.f) {
                    if (iheVar.e == null && !iheVar.g && !iheVar.f && iheVar.e == null) {
                        try {
                            try {
                                hheVarA = iheVar.a((Engine) lhe.a.d(iheVar.c, new vx7(1, iheVar, ihe.class, "teardownSetup", "teardownSetup(Lcom/google/android/filament/Engine;)V", 0, 28)));
                            } catch (Throwable th) {
                                hf8.Q.getClass();
                                ef8.a("TarotBox3D").c("Thumbnail Filament setup failed", th);
                                iheVar.f = true;
                                lhe.a.C();
                                hheVarA = null;
                            }
                            iheVar.e = hheVarA;
                        } catch (Throwable th2) {
                            hf8.Q.getClass();
                            ef8.a("TarotBox3D").c("Thumbnail Filament engine creation failed", th2);
                            iheVar.f = true;
                        }
                    }
                    hhe hheVar = iheVar.e;
                    if (hheVar != null) {
                        try {
                            wge wgeVar = xge.a;
                            Context context = iheVar.b;
                            context.getClass();
                            so2 so2Var = new so2(hheVar, z7, iheVar, 10);
                            wgeVar.getClass();
                            tarotSkinIdentify2.getClass();
                            tarotSkinIdentify = tarotSkinIdentify2;
                            try {
                                xfeVar = (xfe) z5c.I(nu4.a, new vge(wgeVar, so2Var, context, tarotSkinIdentify, null));
                            } catch (Throwable th3) {
                                th = th3;
                                Throwable th4 = th;
                                hf8.Q.getClass();
                                ef8.a("TarotBox3D").c("Tarot box thumbnail bake failed for " + tarotSkinIdentify, th4);
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            tarotSkinIdentify = tarotSkinIdentify2;
                        }
                    }
                }
                zgeVar.d(xfeVar);
                break;
            default:
                mhf mhfVar = (mhf) this.d;
                boolean z8 = this.b;
                x16 x16Var3 = (x16) this.c;
                e89 e89Var5 = (e89) this.e;
                if (!((Boolean) e89Var5.getValue()).booleanValue() && !mhfVar.q()) {
                    e89Var5.setValue(Boolean.TRUE);
                    if (z8 && !mhfVar.Z0) {
                        mhfVar.Z0 = true;
                        mhf.Q(mhfVar, "paywall_action", "close", null, 4);
                    }
                    x16Var3.invoke();
                }
                break;
        }
        return wef.a;
    }

    public /* synthetic */ nt5(aw2 aw2Var, boolean z, dc9 dc9Var, cb9 cb9Var) {
        this.a = 3;
        this.c = aw2Var;
        this.b = z;
        this.d = dc9Var;
        this.e = cb9Var;
    }

    public /* synthetic */ nt5(e89 e89Var, boolean z, a26 a26Var, e89 e89Var2) {
        this.a = 2;
        this.e = e89Var;
        this.b = z;
        this.c = a26Var;
        this.d = e89Var2;
    }

    public /* synthetic */ nt5(kn2 kn2Var, boolean z, gh6 gh6Var, x16 x16Var) {
        this.a = 5;
        this.d = kn2Var;
        this.b = z;
        this.e = gh6Var;
        this.c = x16Var;
    }

    public /* synthetic */ nt5(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z;
    }

    public /* synthetic */ nt5(boolean z, Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
