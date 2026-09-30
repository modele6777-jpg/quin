package defpackage;

import ai.askquin.R;
import android.content.Context;
import java.util.ArrayList;
import tech.chatmind.api.PatternData;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ale[], still in use, count: 1, list:
  (r0v1 ale[]) from 0x0244: CONSTRUCTOR (r0v1 ale[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:581) call: mx4.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ale implements dvd {
    QI_Spread("QI", R.string.qi_spread_name, R.string.qi_spread_description, R.array.qi_keywords, 1, R.drawable.spread_qi, R.drawable.spread_qi_neo),
    /* JADX INFO: Fake field, exist only in values array */
    SAO_Spread("SAO", R.string.sao_spread_name, R.string.sao_spread_description, R.array.sao_keywords, 3, R.drawable.spread_sao, R.drawable.spread_sao_neo),
    /* JADX INFO: Fake field, exist only in values array */
    PPF_Spread("PPF", R.string.ppf_spread_name, R.string.ppf_spread_description, R.array.ppf_keywords, 3, R.drawable.spread_sao, R.drawable.spread_sao_neo),
    /* JADX INFO: Fake field, exist only in values array */
    ORA_Spread("ORA", R.string.ora_spread_name, R.string.ora_spread_description, R.array.ora_keywords, 3, R.drawable.spread_sao, R.drawable.spread_sao_neo),
    /* JADX INFO: Fake field, exist only in values array */
    TFA_Spread("TFA", R.string.tfa_spread_name, R.string.tfa_spread_description, R.array.tfa_keywords, 3, R.drawable.spread_sao, R.drawable.spread_sao_neo),
    /* JADX INFO: Fake field, exist only in values array */
    MOU_Spread("MOU", R.string.mou_spread_name, R.string.mou_spread_description, R.array.mou_keywords, 3, R.drawable.spread_mou, R.drawable.spread_mou_neo),
    /* JADX INFO: Fake field, exist only in values array */
    TS_Spread("TS", R.string.ts_spread_name, R.string.ts_spread_description, R.array.ts_keywords, 4, R.drawable.spread_ts, R.drawable.spread_ts_neo),
    /* JADX INFO: Fake field, exist only in values array */
    JI_Spread("JI", R.string.ji_spread_name, R.string.ji_spread_description, R.array.ji_keywords, 5, R.drawable.spread_ji, R.drawable.spread_ji_neo),
    /* JADX INFO: Fake field, exist only in values array */
    RD_Spread("RD", R.string.rd_spread_name, R.string.rd_spread_description, R.array.rd_keywords, 5, R.drawable.spread_rd, R.drawable.spread_rd_neo),
    /* JADX INFO: Fake field, exist only in values array */
    LC_Spread("LC", R.string.lc_spread_name, R.string.lc_spread_description, R.array.lc_keywords, 5, R.drawable.spread_lc, R.drawable.spread_lc_neo),
    /* JADX INFO: Fake field, exist only in values array */
    GA_Spread("GA", R.string.ga_spread_name, R.string.ga_spread_description, R.array.ga_keywords, 5, R.drawable.spread_ga, R.drawable.spread_ga_neo),
    /* JADX INFO: Fake field, exist only in values array */
    P_Spread("P", R.string.p_spread_name, R.string.p_spread_description, R.array.p_keywords, 5, R.drawable.spread_p, R.drawable.spread_p_neo),
    /* JADX INFO: Fake field, exist only in values array */
    SG_Spread("SG", R.string.sg_spread_name, R.string.sg_spread_description, R.array.sg_keywords, 5, R.drawable.spread_rd, R.drawable.spread_rd_neo),
    /* JADX INFO: Fake field, exist only in values array */
    IE_Spread("IE", R.string.ie_spread_name, R.string.ie_spread_description, R.array.ie_keywords, 5, R.drawable.spread_ga, R.drawable.spread_ga_neo),
    /* JADX INFO: Fake field, exist only in values array */
    DM_Spread("DM", R.string.dm_spread_name, R.string.dm_spread_description, R.array.dm_keywords, 5, R.drawable.spread_p, R.drawable.spread_p_neo),
    /* JADX INFO: Fake field, exist only in values array */
    C_Spread("C", R.string.c_spread_name, R.string.c_spread_description, R.array.c_keywords, 5, R.drawable.spread_c, R.drawable.spread_c_neo),
    /* JADX INFO: Fake field, exist only in values array */
    CPS_Spread("CPS", R.string.cps_spread_name, R.string.cps_spread_description, R.array.cps_keywords, 7, R.drawable.spread_cps, R.drawable.spread_cps_neo),
    /* JADX INFO: Fake field, exist only in values array */
    TOL_Spread("TOL", R.string.tol_spread_name, R.string.tol_spread_description, R.array.tol_keywords, 10, R.drawable.spread_tol, R.drawable.spread_tol_neo),
    /* JADX INFO: Fake field, exist only in values array */
    CC_Spread("CC", R.string.cc_spread_name, R.string.cc_spread_description, R.array.cc_keywords, 10, R.drawable.spread_cc, R.drawable.spread_cc_neo),
    /* JADX INFO: Fake field, exist only in values array */
    Z_Spread("Z", R.string.z_spread_name, R.string.z_spread_description, R.array.z_keywords, 12, R.drawable.spread_z, R.drawable.spread_z_neo);

    public static final pzd a = new pzd(4);
    public static final /* synthetic */ mx4 d;
    private final int cardCount;
    private final int descriptionRes;
    private final int drawableId;
    private final int drawableIdNeo;
    private final String id;
    private final int keywordRes;
    private final int nameRes;

    static {
        d = new mx4(new ale[]{r0, new ale("SAO", R.string.sao_spread_name, R.string.sao_spread_description, R.array.sao_keywords, 3, R.drawable.spread_sao, R.drawable.spread_sao_neo), new ale("PPF", R.string.ppf_spread_name, R.string.ppf_spread_description, R.array.ppf_keywords, 3, R.drawable.spread_sao, R.drawable.spread_sao_neo), new ale("ORA", R.string.ora_spread_name, R.string.ora_spread_description, R.array.ora_keywords, 3, R.drawable.spread_sao, R.drawable.spread_sao_neo), new ale("TFA", R.string.tfa_spread_name, R.string.tfa_spread_description, R.array.tfa_keywords, 3, R.drawable.spread_sao, R.drawable.spread_sao_neo), new ale("MOU", R.string.mou_spread_name, R.string.mou_spread_description, R.array.mou_keywords, 3, R.drawable.spread_mou, R.drawable.spread_mou_neo), new ale("TS", R.string.ts_spread_name, R.string.ts_spread_description, R.array.ts_keywords, 4, R.drawable.spread_ts, R.drawable.spread_ts_neo), new ale("JI", R.string.ji_spread_name, R.string.ji_spread_description, R.array.ji_keywords, 5, R.drawable.spread_ji, R.drawable.spread_ji_neo), new ale("RD", R.string.rd_spread_name, R.string.rd_spread_description, R.array.rd_keywords, 5, R.drawable.spread_rd, R.drawable.spread_rd_neo), new ale("LC", R.string.lc_spread_name, R.string.lc_spread_description, R.array.lc_keywords, 5, R.drawable.spread_lc, R.drawable.spread_lc_neo), new ale("GA", R.string.ga_spread_name, R.string.ga_spread_description, R.array.ga_keywords, 5, R.drawable.spread_ga, R.drawable.spread_ga_neo), new ale("P", R.string.p_spread_name, R.string.p_spread_description, R.array.p_keywords, 5, R.drawable.spread_p, R.drawable.spread_p_neo), new ale("SG", R.string.sg_spread_name, R.string.sg_spread_description, R.array.sg_keywords, 5, R.drawable.spread_rd, R.drawable.spread_rd_neo), new ale("IE", R.string.ie_spread_name, R.string.ie_spread_description, R.array.ie_keywords, 5, R.drawable.spread_ga, R.drawable.spread_ga_neo), new ale("DM", R.string.dm_spread_name, R.string.dm_spread_description, R.array.dm_keywords, 5, R.drawable.spread_p, R.drawable.spread_p_neo), new ale("C", R.string.c_spread_name, R.string.c_spread_description, R.array.c_keywords, 5, R.drawable.spread_c, R.drawable.spread_c_neo), new ale("CPS", R.string.cps_spread_name, R.string.cps_spread_description, R.array.cps_keywords, 7, R.drawable.spread_cps, R.drawable.spread_cps_neo), new ale("TOL", R.string.tol_spread_name, R.string.tol_spread_description, R.array.tol_keywords, 10, R.drawable.spread_tol, R.drawable.spread_tol_neo), new ale("CC", R.string.cc_spread_name, R.string.cc_spread_description, R.array.cc_keywords, 10, R.drawable.spread_cc, R.drawable.spread_cc_neo), new ale("Z", R.string.z_spread_name, R.string.z_spread_description, R.array.z_keywords, 12, R.drawable.spread_z, R.drawable.spread_z_neo)});
    }

    public ale(String str, int i, int i2, int i3, int i4, int i5, int i6) {
        super(str, i);
        this.id = str;
        this.nameRes = i;
        this.descriptionRes = i2;
        this.keywordRes = i3;
        this.cardCount = i4;
        this.drawableId = i5;
        this.drawableIdNeo = i6;
    }

    public static ale valueOf(String str) {
        return (ale) Enum.valueOf(ale.class, str);
    }

    public static ale[] values() {
        return (ale[]) c.clone();
    }

    @Override // defpackage.dvd
    public final int a() {
        return this.drawableId;
    }

    @Override // defpackage.dvd
    public final String b(l46 l46Var) {
        l46Var.f0(-1722400025);
        String strQ = afc.q(this.nameRes, l46Var);
        l46Var.r(false);
        return strQ;
    }

    @Override // defpackage.dvd
    public final int c() {
        return this.drawableIdNeo;
    }

    public final ArrayList d() {
        int i = this.cardCount;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new PatternData("", null));
        }
        return arrayList;
    }

    public final int e() {
        return this.cardCount;
    }

    public final int g() {
        return this.descriptionRes;
    }

    public final String getId() {
        return this.id;
    }

    public final int h() {
        return this.keywordRes;
    }

    public final int i() {
        return this.nameRes;
    }

    public final String j() {
        Context context = cn1.P0;
        context.getClass();
        String string = context.getString(this.nameRes);
        string.getClass();
        return string;
    }

    public final boolean k() {
        return this.cardCount > 3;
    }
}
