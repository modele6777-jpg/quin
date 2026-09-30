package defpackage;

import ai.askquin.R;
import ai.askquin.ui.annual.AnnualShareURLRoute;
import ai.askquin.ui.fourseasons.FourSeasonsShareURLRoute;
import android.content.Context;
import android.net.Uri;
import tech.chatmind.api.seasonal.model.SolarTerm;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b40 implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ka9 b;

    public /* synthetic */ b40(ka9 ka9Var, int i) {
        this.a = i;
        this.b = ka9Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        mic micVarO;
        int i = this.a;
        wef wefVar = wef.a;
        i8c i8cVar = sf2.a;
        ka9 ka9Var = this.b;
        switch (i) {
            case 0:
                da9 da9Var = (da9) obj;
                l46 l46Var = (l46) obj2;
                ((Integer) obj3).getClass();
                da9Var.getClass();
                Context context = (Context) l46Var.k(uq.b);
                AnnualShareURLRoute annualShareURLRoute = (AnnualShareURLRoute) vfh.S(da9Var, job.a.b(AnnualShareURLRoute.class));
                context.getClass();
                String strD = vd8.d();
                String strJ = ib8.j("https://quin.love", strD.equals("en") ? "" : "/".concat(strD), "/annual-forecast-2026-entry?os=android&entry=share_icon");
                String string = context.getString(R.string.annual_fortune_share_title);
                string.getClass();
                String string2 = context.getString(R.string.annual_fortune_share_summary);
                string2.getClass();
                w6d w6dVar = new w6d(strJ, string, string2, R.drawable.annual_fortune_share_thumbnail, "https://quin.love/images/annual-forecast-2026/share-thumbnail.png");
                boolean zI = l46Var.i(annualShareURLRoute);
                Object objR = l46Var.R();
                if (zI || objR == i8cVar) {
                    objR = new p(7, annualShareURLRoute);
                    l46Var.p0(objR);
                }
                x16 x16Var = (x16) objR;
                boolean zI2 = l46Var.i(ka9Var);
                Object objR2 = l46Var.R();
                if (zI2 || objR2 == i8cVar) {
                    objR2 = new y30(ka9Var, 19);
                    l46Var.p0(objR2);
                }
                y8c.c(w6dVar, x16Var, (x16) objR2, l46Var, 0, 0);
                break;
            case 1:
                da9 da9Var2 = (da9) obj;
                l46 l46Var2 = (l46) obj2;
                ((Integer) obj3).getClass();
                da9Var2.getClass();
                Context context2 = (Context) l46Var2.k(uq.b);
                FourSeasonsShareURLRoute fourSeasonsShareURLRoute = (FourSeasonsShareURLRoute) vfh.S(da9Var2, job.a.b(FourSeasonsShareURLRoute.class));
                SolarTerm solarTermT = m7c.t(fourSeasonsShareURLRoute.getSolarTerm());
                if (solarTermT != null) {
                    int year = fourSeasonsShareURLRoute.getYear();
                    mic.a.getClass();
                    micVarO = jy4.o(year, solarTermT);
                } else {
                    micVarO = null;
                }
                if (solarTermT == null || n3d.e(fourSeasonsShareURLRoute.getYear(), solarTermT) == null || micVarO == null) {
                    l46Var2.f0(1787391159);
                    boolean zI3 = l46Var2.i(ka9Var);
                    Object objR3 = l46Var2.R();
                    if (zI3 || objR3 == i8cVar) {
                        objR3 = new bv5(ka9Var, null);
                        l46Var2.p0(objR3);
                    }
                    af1.o((l26) objR3, l46Var2, fourSeasonsShareURLRoute);
                    l46Var2.r(false);
                } else {
                    l46Var2.f0(1787505518);
                    l46Var2.r(false);
                    context2.getClass();
                    int iB = micVarO.b();
                    String wireValue = micVarO.c().getWireValue();
                    wireValue.getClass();
                    String string3 = Uri.parse("https://quin.love/seasonal-fortune-entry?os=android&entry=share_icon").buildUpon().appendQueryParameter("year", String.valueOf(iB)).appendQueryParameter("solarTerm", wireValue).build().toString();
                    string3.getClass();
                    String string4 = context2.getString(R.string.four_seasons_share_title, context2.getString(rmc.a(micVarO)));
                    string4.getClass();
                    String string5 = context2.getString(R.string.four_seasons_share_summary);
                    string5.getClass();
                    w6d w6dVar2 = new w6d(string3, string4, string5, if9.w(micVarO).l, t72.I("https://quin.love", "https://quinlove.cn", "https://askquin.ai", "https://askquin.cn").contains("https://quin.love") ? "https://assets.quinlove.cn/images/seasonal-fortune-share-thumbnail.png" : "https://assets-staging.quinlove.cn/images/seasonal-fortune-share-thumbnail.png");
                    boolean zI4 = l46Var2.i(fourSeasonsShareURLRoute) | l46Var2.e(solarTermT.ordinal());
                    Object objR4 = l46Var2.R();
                    if (zI4 || objR4 == i8cVar) {
                        objR4 = new jt3(23, fourSeasonsShareURLRoute, solarTermT);
                        l46Var2.p0(objR4);
                    }
                    x16 x16Var2 = (x16) objR4;
                    boolean zI5 = l46Var2.i(ka9Var);
                    Object objR5 = l46Var2.R();
                    if (zI5 || objR5 == i8cVar) {
                        objR5 = new a40(ka9Var, 26);
                        l46Var2.p0(objR5);
                    }
                    y8c.c(w6dVar2, x16Var2, (x16) objR5, l46Var2, 0, 0);
                }
                break;
            default:
                l46 l46Var3 = (l46) obj2;
                ((Integer) obj3).getClass();
                ((da9) obj).getClass();
                boolean zI6 = l46Var3.i(ka9Var);
                Object objR6 = l46Var3.R();
                if (zI6 || objR6 == i8cVar) {
                    objR6 = new vw5(ka9Var, 17);
                    l46Var3.p0(objR6);
                }
                i7h.e((x16) objR6, l46Var3, 0);
                break;
        }
        return wefVar;
    }
}
