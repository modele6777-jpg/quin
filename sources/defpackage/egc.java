package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class egc extends gbe implements l26 {
    final /* synthetic */ int $changeFlags;
    final /* synthetic */ Uri $changedUri;
    final /* synthetic */ ContentResolver $contentResolver;
    final /* synthetic */ long $generationAtChange;
    final /* synthetic */ x48 $lifecycleOwner;
    final /* synthetic */ LinkedHashSet<String> $observedImages;
    final /* synthetic */ a26 $onScreenshot;
    final /* synthetic */ imb $registered;
    final /* synthetic */ lmb $registrationGeneration;
    final /* synthetic */ int $sdkInt;
    final /* synthetic */ long $startedAtMillis;
    final /* synthetic */ boolean $wasActivityResumedAtChange;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egc(int i, Uri uri, long j, int i2, boolean z, ContentResolver contentResolver, imb imbVar, long j2, lmb lmbVar, x48 x48Var, LinkedHashSet linkedHashSet, a26 a26Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$sdkInt = i;
        this.$changedUri = uri;
        this.$startedAtMillis = j;
        this.$changeFlags = i2;
        this.$wasActivityResumedAtChange = z;
        this.$contentResolver = contentResolver;
        this.$registered = imbVar;
        this.$generationAtChange = j2;
        this.$registrationGeneration = lmbVar;
        this.$lifecycleOwner = x48Var;
        this.$observedImages = linkedHashSet;
        this.$onScreenshot = a26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new egc(this.$sdkInt, this.$changedUri, this.$startedAtMillis, this.$changeFlags, this.$wasActivityResumedAtChange, this.$contentResolver, this.$registered, this.$generationAtChange, this.$registrationGeneration, this.$lifecycleOwner, this.$observedImages, this.$onScreenshot, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:90:0x014a  */
    /* JADX WARN: Code duplicated, block: B:92:0x0183 A[RETURN] */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        igc igcVar;
        Object objP0;
        bw2 bw2Var;
        String str;
        String str2;
        String str3;
        Long lD;
        igc igcVar2;
        int i = this.label;
        wef wefVar = wef.a;
        if (i != 0) {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
            return wefVar;
        }
        jzb.q(obj);
        int i2 = this.$sdkInt;
        ContentResolver contentResolver = this.$contentResolver;
        Uri uri = this.$changedUri;
        String[] strArr = {"_display_name", "date_added", "datetaken"};
        Iterator it = (i2 >= 29 ? t72.I(new String[]{"_display_name", "relative_path", "date_added", "datetaken"}, strArr) : t72.I(new String[]{"_display_name", "_data", "date_added", "datetaken"}, strArr)).iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                igcVar = null;
                break;
            }
            String[] strArr2 = (String[]) it.next();
            Iterator it2 = t72.I("date_added DESC", null).iterator();
            while (it2.hasNext()) {
                try {
                    Cursor cursorQuery = contentResolver.query(uri, strArr2, null, null, (String) it2.next());
                    if (cursorQuery != null) {
                        try {
                            Cursor cursor = cursorQuery.moveToFirst() ? cursorQuery : null;
                            igcVar2 = cursor != null ? new igc(hgc.Y(cursor, "_display_name"), hgc.Y(cursor, "relative_path"), hgc.Y(cursor, "_data"), hgc.E(cursor, "date_added"), hgc.E(cursor, "datetaken")) : null;
                            cursorQuery.close();
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                ym8.t(cursorQuery, th);
                                throw th2;
                            }
                        }
                    } else {
                        igcVar2 = null;
                    }
                    if (igcVar2 != null) {
                        igcVar = igcVar2;
                        break loop0;
                    }
                } catch (Exception unused) {
                    continue;
                }
            }
        }
        Uri uri2 = this.$changedUri;
        long j = this.$startedAtMillis;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i3 = this.$sdkInt;
        int i4 = this.$changeFlags;
        boolean z = this.$wasActivityResumedAtChange;
        uri2.getClass();
        if (z && hgc.A(uri2)) {
            if (igcVar == null || (((str = igcVar.a) == null || v4e.Q(str)) && (((str2 = igcVar.b) == null || v4e.Q(str2)) && ((str3 = igcVar.c) == null || v4e.Q(str3))))) {
                if (i3 < 30 || i4 == 0 || (i4 & 4) != 0) {
                    js3 js3Var = ga4.a;
                    wg6 wg6Var = mk8.a.f;
                    dgc dgcVar = new dgc(this.$registered, this.$generationAtChange, this.$registrationGeneration, this.$lifecycleOwner, this.$changedUri, igcVar, this.$observedImages, this.$onScreenshot, null);
                    this.L$0 = null;
                    this.label = 1;
                    objP0 = ynb.p0(wg6Var, dgcVar, this);
                    bw2Var = bw2.a;
                    if (objP0 == bw2Var) {
                        return bw2Var;
                    }
                }
            } else if (hgc.w(igcVar, uri2)) {
                if (hgc.d(igcVar) == null) {
                    if (i3 < 30 || i4 == 0 || (i4 & 4) != 0) {
                        js3 js3Var2 = ga4.a;
                        wg6 wg6Var2 = mk8.a.f;
                        dgc dgcVar2 = new dgc(this.$registered, this.$generationAtChange, this.$registrationGeneration, this.$lifecycleOwner, this.$changedUri, igcVar, this.$observedImages, this.$onScreenshot, null);
                        this.L$0 = null;
                        this.label = 1;
                        objP0 = ynb.p0(wg6Var2, dgcVar2, this);
                        bw2Var = bw2.a;
                        if (objP0 == bw2Var) {
                            return bw2Var;
                        }
                    }
                } else if (hgc.A(uri2) && hgc.w(igcVar, uri2) && (lD = hgc.d(igcVar)) != null) {
                    long jLongValue = lD.longValue();
                    long jMax = Math.max(j - 2000, jCurrentTimeMillis - 15000);
                    long j2 = jCurrentTimeMillis + 2000;
                    if (jMax <= jLongValue && jLongValue <= j2) {
                        js3 js3Var3 = ga4.a;
                        wg6 wg6Var3 = mk8.a.f;
                        dgc dgcVar3 = new dgc(this.$registered, this.$generationAtChange, this.$registrationGeneration, this.$lifecycleOwner, this.$changedUri, igcVar, this.$observedImages, this.$onScreenshot, null);
                        this.L$0 = null;
                        this.label = 1;
                        objP0 = ynb.p0(wg6Var3, dgcVar3, this);
                        bw2Var = bw2.a;
                        if (objP0 == bw2Var) {
                            return bw2Var;
                        }
                    }
                }
            }
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((egc) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
