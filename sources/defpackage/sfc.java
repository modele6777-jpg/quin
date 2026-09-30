package defpackage;

import ai.askquin.R;
import ai.askquin.model.TarotSkinIdentify;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Range;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sfc {
    public static szc a;

    public static final void a(a26 a26Var, l46 l46Var, int i) {
        l46Var.h0(-1118055641);
        int i2 = i | 6;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = new fnc(28);
                l46Var.p0(objR);
            }
            a26Var = (a26) objR;
            Context context = (Context) l46Var.k(uq.b);
            Object objR2 = l46Var.R();
            if (objR2 == i8cVar) {
                objR2 = new pzc(a26Var);
                l46Var.p0(objR2);
            }
            pzc pzcVar = (pzc) objR2;
            boolean zI = l46Var.i(context);
            Object objR3 = l46Var.R();
            if (zI || objR3 == i8cVar) {
                objR3 = new h6b(19, context, pzcVar);
                l46Var.p0(objR3);
            }
            af1.g(wef.a, (a26) objR3, l46Var);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new k50(i, 13, a26Var);
        }
    }

    public static final void b(TarotSkinIdentify tarotSkinIdentify, dmd dmdVar, hmd hmdVar, x16 x16Var, x16 x16Var2, x16 x16Var3, a26 a26Var, l46 l46Var, int i) {
        int i2;
        Object obj;
        Object obj2;
        String strI;
        l46Var.h0(-1634582704);
        if ((i & 6) == 0) {
            i2 = (l46Var.e(tarotSkinIdentify.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.e(dmdVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? l46Var.g(hmdVar) : l46Var.i(hmdVar) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            obj = x16Var;
            i2 |= l46Var.i(obj) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        } else {
            obj = x16Var;
        }
        if ((i & 24576) == 0) {
            obj2 = x16Var2;
            i2 |= l46Var.i(obj2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        } else {
            obj2 = x16Var2;
        }
        if ((196608 & i) == 0) {
            i2 |= l46Var.i(x16Var3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= l46Var.i(a26Var) ? 1048576 : 524288;
        }
        if (l46Var.W(i2 & 1, (599187 & i2) != 599186)) {
            e89 e89VarI = jzb.i(k8b.a, k8b.c(), l46Var, 0, 2);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (z || objR == i8cVar) {
                objR = new fmd(tarotSkinIdentify, null);
                l46Var.p0(objR);
            }
            af1.o((l26) objR, l46Var, wef.a);
            int iOrdinal = hmdVar.a.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                strI = tec.i(l46Var, 1124073826, R.string.skin_predraw_download_now, l46Var, false);
            } else if (iOrdinal == 2) {
                l46Var.f0(1124076741);
                strI = afc.r(R.string.skin_predraw_downloading_progress, new Object[]{Integer.valueOf((int) (hmdVar.b * 100.0f))}, l46Var);
                l46Var.r(false);
            } else if (iOrdinal == 3) {
                strI = tec.i(l46Var, 1124081493, R.string.button_retry, l46Var, false);
            } else {
                if (iOrdinal != 4) {
                    throw tec.d(1124071003, l46Var, false);
                }
                l46Var.f0(1124083833);
                strI = afc.q(dmdVar.a(), l46Var);
                l46Var.r(false);
            }
            String str = strI;
            gmd gmdVar = hmdVar.a;
            gmd gmdVar2 = gmd.c;
            boolean z2 = gmdVar != gmdVar2;
            boolean z3 = (gmdVar == gmdVar2 || gmdVar == gmd.e) ? false : true;
            String strQ = afc.q(R.string.skin_predraw_title, l46Var);
            dd2 dd2VarB0 = af1.b0(-1546771135, new z8d(4, dmdVar), l46Var);
            String strQ2 = afc.q(R.string.skin_predraw_use_default, l46Var);
            boolean zG = l46Var.g(e89VarI) | (i3 == 4) | ((i2 & 3670016) == 1048576);
            Object objR2 = l46Var.R();
            if (zG || objR2 == i8cVar) {
                objR2 = new smc(a26Var, e89VarI, tarotSkinIdentify, 4);
                l46Var.p0(objR2);
            }
            x16 x16Var4 = (x16) objR2;
            boolean z4 = (i3 == 4) | ((i2 & 896) == 256 || ((i2 & 512) != 0 && l46Var.i(hmdVar))) | ((i2 & 7168) == 2048) | ((57344 & i2) == 16384) | ((i2 & 458752) == 131072);
            Object objR3 = l46Var.R();
            if (z4 || objR3 == i8cVar) {
                m8 m8Var = new m8(hmdVar, obj, obj2, x16Var3, tarotSkinIdentify, 20);
                l46Var.p0(m8Var);
                objR3 = m8Var;
            }
            kj0.F(strQ, dd2VarB0, str, strQ2, z2, z3, null, null, x16Var4, (x16) objR3, l46Var, 48, 192);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o53(tarotSkinIdentify, dmdVar, hmdVar, x16Var, x16Var2, x16Var3, a26Var, i);
        }
    }

    public static final void c(final TarotSkinIdentify tarotSkinIdentify, dmd dmdVar, x16 x16Var, a26 a26Var, l46 l46Var, int i) {
        int i2;
        a26 a26Var2;
        dmdVar.getClass();
        x16Var.getClass();
        a26Var.getClass();
        l46Var.h0(1218049408);
        if ((i & 6) == 0) {
            i2 = (l46Var.e(tarotSkinIdentify.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.e(dmdVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            a26Var2 = a26Var;
            i2 |= l46Var.i(a26Var2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        } else {
            a26Var2 = a26Var;
        }
        final int i3 = 0;
        if (l46Var.W(i2 & 1, (i2 & 1171) != 1170)) {
            nfc nfcVarB = kr7.b(l46Var);
            boolean zG = l46Var.g(null) | l46Var.g(nfcVarB);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (zG || objR == obj) {
                objR = nfcVarB.b(job.a.b(cmd.class), null, null);
                l46Var.p0(objR);
            }
            final cmd cmdVar = (cmd) objR;
            ys3 ys3Var = (ys3) cmdVar;
            ys3Var.getClass();
            hmd hmdVar = (hmd) jzb.i(new xs3(ys3Var.g, tarotSkinIdentify), new hmd(gmd.b, 0.0f, 6), l46Var, 0, 2).getValue();
            int i4 = i2 & 14;
            boolean zI = l46Var.i(cmdVar) | (i4 == 4);
            Object objR2 = l46Var.R();
            if (zI || objR2 == obj) {
                objR2 = new x16() { // from class: emd
                    @Override // defpackage.x16
                    public final Object invoke() {
                        int i5 = i3;
                        wef wefVar = wef.a;
                        TarotSkinIdentify tarotSkinIdentify2 = tarotSkinIdentify;
                        cmd cmdVar2 = cmdVar;
                        switch (i5) {
                            case 0:
                                ((ys3) cmdVar2).e(tarotSkinIdentify2);
                                break;
                            default:
                                ((ys3) cmdVar2).c(tarotSkinIdentify2);
                                break;
                        }
                        return wefVar;
                    }
                };
                l46Var.p0(objR2);
            }
            x16 x16Var2 = (x16) objR2;
            int i5 = (l46Var.i(cmdVar) ? 1 : 0) | (i4 == 4 ? 1 : 0);
            Object objR3 = l46Var.R();
            if (i5 != 0 || objR3 == obj) {
                final int i6 = 1;
                objR3 = new x16() { // from class: emd
                    @Override // defpackage.x16
                    public final Object invoke() {
                        int i7 = i6;
                        wef wefVar = wef.a;
                        TarotSkinIdentify tarotSkinIdentify2 = tarotSkinIdentify;
                        cmd cmdVar2 = cmdVar;
                        switch (i7) {
                            case 0:
                                ((ys3) cmdVar2).e(tarotSkinIdentify2);
                                break;
                            default:
                                ((ys3) cmdVar2).c(tarotSkinIdentify2);
                                break;
                        }
                        return wefVar;
                    }
                };
                l46Var.p0(objR3);
            }
            int i7 = i2 & 126;
            int i8 = i2 << 9;
            b(tarotSkinIdentify, dmdVar, hmdVar, x16Var2, (x16) objR3, x16Var, a26Var2, l46Var, i7 | (458752 & i8) | (i8 & 3670016));
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new rb(tarotSkinIdentify, dmdVar, x16Var, a26Var, i, 19);
        }
    }

    public static final long d(float f, float f2) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        int i = r2f.c;
        return jFloatToRawIntBits;
    }

    public static void e(Appendable appendable, Object obj, a26 a26Var) {
        if (a26Var != null) {
            appendable.append((CharSequence) a26Var.d(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(obj.toString());
        }
    }

    public static bb3 f(Bundle bundle, Bundle bundle2) {
        kb6 kb6Var = new kb6(11);
        ((LinkedHashMap) kb6Var.b).put("BUNDLE_DATA_CONVERTER_VERSION", "1.0");
        int i = 15;
        j(new psd("session_bundle:", bundle, kb6Var, i));
        i(new psd("notification_bundle:", bundle2, kb6Var, i));
        return kb6Var.i();
    }

    public static final long g(z2f z2fVar, jse jseVar, ute uteVar, long j) {
        long j2;
        long jN = jseVar.n();
        if ((9223372034707292159L & jN) != 9205357640488583168L && z2fVar.d().c.length() != 0) {
            long j3 = z2fVar.d().d;
            sg6 sg6VarL = jseVar.l();
            int i = sg6VarL == null ? -1 : zpe.a[sg6VarL.ordinal()];
            if (i != -1) {
                if (i == 1 || i == 2) {
                    int i2 = eue.c;
                    j2 = j3 >> 32;
                } else {
                    if (i != 3) {
                        ap.c();
                        return 0L;
                    }
                    int i3 = eue.c;
                    j2 = j3 & 4294967295L;
                }
                int i4 = (int) j2;
                ste steVarC = uteVar.c();
                if (steVarC != null) {
                    b59 b59Var = steVarC.b;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jN >> 32));
                    int iD = b59Var.d(i4);
                    float fH = steVarC.h(iD);
                    float fI = steVarC.i(iD);
                    float fN = mh3.n(fIntBitsToFloat, Math.min(fH, fI), Math.max(fH, fI));
                    if (e77.b(j, 0L) || Math.abs(fIntBitsToFloat - fN) <= ((int) (j >> 32)) / 2) {
                        float f = b59Var.f(iD);
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(((b59Var.b(iD) - f) / 2.0f) + f)) & 4294967295L) | (((long) Float.floatToRawIntBits(fN)) << 32);
                        bv7 bv7VarE = uteVar.e();
                        hl9 hl9Var = null;
                        if (bv7VarE != null) {
                            if (!bv7VarE.h()) {
                                bv7VarE = null;
                            }
                            if (bv7VarE != null) {
                                jFloatToRawIntBits = xxb.n(jFloatToRawIntBits, dj6.Z(bv7VarE));
                            }
                        }
                        bv7 bv7VarE2 = uteVar.e();
                        if (bv7VarE2 == null) {
                            return jFloatToRawIntBits;
                        }
                        if (!bv7VarE2.h()) {
                            bv7VarE2 = null;
                        }
                        if (bv7VarE2 == null) {
                            return jFloatToRawIntBits;
                        }
                        bv7 bv7Var = (bv7) uteVar.e.getValue();
                        if (bv7Var != null) {
                            if (!bv7Var.h()) {
                                bv7Var = null;
                            }
                            if (bv7Var != null) {
                                hl9Var = new hl9(bv7Var.K(bv7VarE2, jFloatToRawIntBits));
                            }
                        }
                        return hl9Var != null ? hl9Var.a : jFloatToRawIntBits;
                    }
                }
            }
        }
        return 9205357640488583168L;
    }

    public static final Collection h(Collection collection, Collection collection2) {
        collection2.getClass();
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    public static void i(psd psdVar) {
        psdVar.n("notification_channel_name");
        psdVar.n("notification_title");
        psdVar.n("notification_subtext");
        psdVar.g("notification_color");
        psdVar.m(600000L, "notification_timeout");
        switch (psdVar.a) {
            case 15:
                Bundle bundle = (Bundle) psdVar.c;
                String str = (String) psdVar.b;
                kb6 kb6Var = (kb6) psdVar.d;
                ((LinkedHashMap) kb6Var.b).put(str.concat("notification_intent_reconstruct_from_data"), Boolean.valueOf(bundle.getBoolean("notification_intent_reconstruct_from_data")));
                break;
            default:
                ((Bundle) psdVar.d).putBoolean("notification_intent_reconstruct_from_data", ((bb3) psdVar.c).a(((String) psdVar.b).concat("notification_intent_reconstruct_from_data")));
                break;
        }
        psdVar.n("notification_intent_component_class_name");
        psdVar.n("notification_intent_component_package_name");
        psdVar.n("notification_intent_package");
        psdVar.n("notification_intent_action");
        psdVar.n("notification_intent_data");
        psdVar.g("notification_intent_flags");
        psdVar.n("notification_intent_extra_error_dialog_document_id");
    }

    public static void j(psd psdVar) {
        psdVar.g("session_id");
        psdVar.g("app_version_code");
        for (String str : psdVar.b("pack_names")) {
            psdVar.i(hfc.b("pack_version", str));
            psdVar.n(hfc.b("pack_version_tag", str));
            psdVar.g(hfc.b("status", str));
            psdVar.i(hfc.b("total_bytes_to_download", str));
            for (String str2 : psdVar.b(hfc.b("slice_ids", str))) {
                String strE = hfc.e("chunk_intents", str, str2);
                int i = 0;
                switch (psdVar.a) {
                    case 15:
                        ArrayList parcelableArrayList = ((Bundle) psdVar.c).getParcelableArrayList(strE);
                        if (parcelableArrayList != null) {
                            String[] strArr = new String[parcelableArrayList.size()];
                            while (i < parcelableArrayList.size()) {
                                Intent intent = (Intent) parcelableArrayList.get(i);
                                strArr[i] = (intent == null || intent.getData() == null) ? "" : intent.getData().toString();
                                i++;
                            }
                            ((LinkedHashMap) ((kb6) psdVar.d).b).put(ib8.j((String) psdVar.b, strE, ":intent_data"), strArr);
                        }
                        break;
                    default:
                        String[] strArrE = ((bb3) psdVar.c).e(ks0.l(new StringBuilder((String) psdVar.b), strE, ":intent_data"));
                        if (strArrE != null) {
                            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(strArrE.length);
                            while (i < strArrE.length) {
                                String str3 = strArrE[i];
                                arrayList.add(str3.isEmpty() ? null : new Intent().setData(Uri.parse(str3)));
                                i++;
                            }
                            ((Bundle) psdVar.d).putParcelableArrayList(strE, arrayList);
                        }
                        break;
                }
                psdVar.n(hfc.e("uncompressed_hash_sha256", str, str2));
                psdVar.i(hfc.e("uncompressed_size", str, str2));
                psdVar.g(hfc.e("patch_format", str, str2));
                psdVar.g(hfc.e("compression_format", str, str2));
            }
        }
    }

    public static ArrayList k(int i) {
        ArrayList arrayList = new ArrayList(30);
        for (int i2 = 0; i2 < 30; i2++) {
            arrayList.add(Float.valueOf(Math.abs((((i2 * i2) * 7) + ((i2 * 31) + i)) % 100) / 100.0f));
        }
        return arrayList;
    }

    public static final cqd l(ArrayList arrayList) {
        cqd cqdVar = new cqd();
        for (Object obj : arrayList) {
            dr8 dr8Var = (dr8) obj;
            if (dr8Var != null && dr8Var != cr8.b) {
                cqdVar.add(obj);
            }
        }
        return cqdVar;
    }

    public static final void m(ng1 ng1Var, hc2 hc2Var, vd9 vd9Var) {
        b91 b91VarS;
        szc szcVar = a;
        if (szcVar == null) {
            qc0.p("mCameraUseCaseAdapterProvider must be initialized first!");
            return;
        }
        String strD = ng1Var.d();
        strD.getClass();
        pg1 pg1VarB = ((vi1) szcVar.b).b(strD);
        vf vfVar = new vf(pg1VarB.q(), xe1.a);
        k47 k47Var = k47.d;
        lk1 lk1Var = new lk1(pg1VarB, null, vfVar, null, k47Var, k47Var, (if1) szcVar.c, (vea) szcVar.e, (akf) szcVar.d);
        synchronized (lk1Var.y) {
        }
        List list = (List) hc2Var.b;
        synchronized (lk1Var.y) {
            lk1Var.v = list;
        }
        synchronized (lk1Var.y) {
        }
        Range range = (Range) hc2Var.c;
        synchronized (lk1Var.y) {
            lk1Var.w = range;
        }
        List list2 = (List) hc2Var.f;
        b21.q("CameraUseCaseAdapter", "simulateAddUseCases: appUseCasesToAdd = " + list2 + ", featureGroup = " + vd9Var);
        synchronized (lk1Var.y) {
            wf wfVar = lk1Var.a;
            te1 te1Var = lk1Var.x;
            wfVar.i(te1Var);
            wf wfVar2 = lk1Var.b;
            if (wfVar2 != null) {
                wfVar2.i(te1Var);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(lk1Var.e);
            linkedHashSet.addAll(list2);
            HashMap mapH = lk1.h(linkedHashSet, vd9Var);
            try {
                try {
                    b91VarS = lk1Var.s(linkedHashSet, lk1Var.b != null);
                    lk1.B(mapH);
                } catch (IllegalArgumentException e) {
                    throw new fk1(e);
                }
            } catch (Throwable th) {
                lk1.B(mapH);
                throw th;
            }
        }
        b91VarS.getClass();
    }

    public static final void n(Level level, Executor executor, Exception exc, String str, Object... objArr) {
        qu1 qu1Var = new qu1(level, exc, str, objArr, false, 8);
        int i = sfh.a;
        executor.execute(new qe(new mmb(), dfh.a(), qu1Var, false, 18));
    }
}
