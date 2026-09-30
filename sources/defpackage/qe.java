package defpackage;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.IActivityHandler;
import com.adjust.sdk.PackageFactory;
import com.adjust.sdk.ReferrerDetails;
import com.adjust.sdk.SdkClickHandler;
import com.adjust.sdk.scheduler.AsyncTaskExecutor;
import com.adjust.sdk.sig.r3;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.assetpacks.bs;
import com.google.android.play.core.assetpacks.j;
import com.google.android.play.core.assetpacks.k;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class qe implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public qe(lah lahVar, AtomicReference atomicReference, ndh ndhVar) {
        this.a = 14;
        this.b = atomicReference;
        this.c = ndhVar;
        Objects.requireNonNull(lahVar);
        this.d = lahVar;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:127:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:128:0x030f  */
    /* JADX WARN: Code duplicated, block: B:130:0x0319  */
    /* JADX WARN: Code duplicated, block: B:132:0x031f  */
    /* JADX WARN: Code duplicated, block: B:135:0x033f  */
    /* JADX WARN: Code duplicated, block: B:138:0x039f A[Catch: SQLiteException -> 0x03aa, TRY_LEAVE, TryCatch #17 {SQLiteException -> 0x03aa, blocks: (B:136:0x037a, B:138:0x039f), top: B:287:0x037a }] */
    /* JADX WARN: Code duplicated, block: B:145:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:147:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:149:0x03de  */
    /* JADX WARN: Code duplicated, block: B:150:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:157:0x0430  */
    /* JADX WARN: Code duplicated, block: B:306:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        int i;
        gfh gfhVarJ;
        esg esgVar;
        Cursor cursor;
        kch kchVar;
        int i2;
        long j;
        Cursor cursorQuery;
        kch kchVarD1;
        String str;
        hch hchVar;
        krg krgVar;
        Long lValueOf;
        ContentValues contentValues;
        w0h w0hVar;
        Cursor cursor2;
        AtomicReference atomicReference;
        qch qchVar;
        int i3 = 7;
        int i4 = 0;
        byte b = 0;
        int i5 = 1;
        String strA = null;
        switch (this.a) {
            case 0:
                ((ActivityHandler) this.d).sendInstallReferrerI((ReferrerDetails) this.b, (String) this.c);
                return;
            case 1:
                ((Handler) this.c).post(new w36(this, ((AsyncTaskExecutor) this.d).doInBackground((Object[]) this.b), b == true ? 1 : 0, i3));
                return;
            case 2:
                try {
                    objCall = ((mq5) this.b).call();
                    break;
                } catch (Exception unused) {
                    objCall = null;
                }
                ((Handler) this.d).post(new w36(13, (is4) this.c, objCall));
                return;
            case 3:
                pl1 pl1Var = (pl1) this.b;
                try {
                    z5c.I(pl1Var.e.U(hj6.Z), new x5c((w5c) this.c, pl1Var, (y5c) this.d, null));
                    return;
                } catch (Throwable th) {
                    pl1Var.p(th);
                    return;
                }
            case 4:
                SdkClickHandler sdkClickHandler = (SdkClickHandler) this.d;
                IActivityHandler iActivityHandler = (IActivityHandler) sdkClickHandler.activityHandlerWeakRef.get();
                if (iActivityHandler == null) {
                    return;
                }
                sdkClickHandler.sendSdkClick(PackageFactory.buildPreinstallSdkClickPackage((String) this.c, (String) this.b, iActivityHandler.getActivityState(), iActivityHandler.getAdjustConfig(), iActivityHandler.getDeviceInfo(), iActivityHandler.getGlobalParameters(), iActivityHandler.getFirstSessionDelayManager()));
                return;
            case 5:
                hfg hfgVar = (hfg) this.b;
                Bundle bundle = (Bundle) this.c;
                bs bsVar = (bs) this.d;
                k kVar = hfgVar.g;
                kVar.getClass();
                if (((Boolean) kVar.b(new j(kVar, bundle, i5))).booleanValue()) {
                    hfgVar.l.post(new wwg(hfgVar, bsVar));
                    ((lhg) hfgVar.m.a()).f();
                    return;
                }
                return;
            case 6:
                zfg zfgVar = (zfg) this.b;
                Bundle bundle2 = (Bundle) this.c;
                bs bsVar2 = (bs) this.d;
                k kVar2 = zfgVar.a;
                kVar2.getClass();
                if (((Boolean) kVar2.b(new j(kVar2, bundle2, i5))).booleanValue()) {
                    kfg kfgVar = zfgVar.e;
                    kfgVar.getClass();
                    kfgVar.b.post(new jfg(i4, kfgVar, bsVar2));
                    ((lhg) zfgVar.g.a()).f();
                    return;
                }
                return;
            case 7:
                super/*ox0*/.c((kd9) this.c, (gi2) this.d);
                return;
            case 8:
                i62 i62Var = (i62) this.c;
                Intent intent = i62Var.a;
                String stringExtra = intent.getStringExtra("google.message_id");
                if (stringExtra == null) {
                    stringExtra = intent.getStringExtra("message_id");
                }
                if (TextUtils.isEmpty(stringExtra)) {
                    gfhVarJ = Tasks.d(null);
                } else {
                    Bundle bundle3 = new Bundle();
                    Intent intent2 = i62Var.a;
                    String stringExtra2 = intent2.getStringExtra("google.message_id");
                    if (stringExtra2 == null) {
                        stringExtra2 = intent2.getStringExtra("message_id");
                    }
                    bundle3.putString("google.message_id", stringExtra2);
                    Intent intent3 = i62Var.a;
                    Integer numValueOf = intent3.hasExtra("google.product_id") ? Integer.valueOf(intent3.getIntExtra("google.product_id", 0)) : null;
                    if (numValueOf != null) {
                        bundle3.putInt("google.product_id", numValueOf.intValue());
                    }
                    Context context = (Context) this.b;
                    bundle3.putBoolean("supports_message_handled", true);
                    veh vehVarI = veh.i(context);
                    synchronized (vehVarI) {
                        i = vehVarI.b;
                        vehVarI.b = i + 1;
                    }
                    gfhVarJ = vehVarI.j(new odh(i, 2, bundle3, 0));
                }
                gfhVarJ.c(g94.f, new bkg((CountDownLatch) this.d));
                return;
            case 9:
                ich ichVar = ((e5h) this.d).d;
                ichVar.U();
                wog wogVar = (wog) this.b;
                Object objC = wogVar.c.c();
                ndh ndhVar = (ndh) this.c;
                if (objC == null) {
                    ichVar.b0(wogVar, ndhVar);
                    return;
                } else {
                    ichVar.Y(wogVar, ndhVar);
                    return;
                }
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                hsg hsgVar = (hsg) this.b;
                ndh ndhVar2 = (ndh) this.c;
                ich ichVar2 = ((e5h) this.d).d;
                if ("_cmp".equals(hsgVar.a) && (esgVar = hsgVar.b) != null) {
                    Bundle bundle4 = esgVar.a;
                    if (bundle4.size() != 0) {
                        String string = bundle4.getString("_cis");
                        if ("referrer broadcast".equals(string) || "referrer API".equals(string)) {
                            ichVar2.v().X.b(hsgVar.toString(), "Event has been filtered ");
                            hsgVar = new hsg("_cmpx", esgVar, hsgVar.c, hsgVar.d, hsgVar.e);
                        }
                    }
                }
                String str2 = hsgVar.a;
                y2h y2hVar = ichVar2.a;
                lch lchVar = ichVar2.g;
                ich.S(y2hVar);
                String str3 = ndhVar2.a;
                ktg ktgVar = TextUtils.isEmpty(str3) ? null : (ktg) y2hVar.z.c(str3);
                if (ktgVar == null) {
                    ichVar2.v().Z.b(ndhVar2.a, "EES not loaded for");
                    ichVar2.U();
                    ichVar2.e(hsgVar, ndhVar2);
                    return;
                }
                try {
                    psd psdVar = ktgVar.c;
                    ich.S(lchVar);
                    HashMap mapO1 = lch.o1(hsgVar.b.f(), true);
                    String strU = rfc.u(str2, ok8.y, ok8.t);
                    if (strU == null) {
                        strU = str2;
                    }
                    if (ktgVar.a(new zjg(strU, hsgVar.d, mapO1))) {
                        if (((zjg) psdVar.c).equals((zjg) psdVar.b)) {
                            ichVar2.U();
                            ichVar2.e(hsgVar, ndhVar2);
                        } else {
                            ichVar2.v().Z.b(str2, "EES edited event");
                            ich.S(lchVar);
                            hsg hsgVarE0 = lch.E0((zjg) psdVar.c);
                            ichVar2.U();
                            ichVar2.e(hsgVarE0, ndhVar2);
                        }
                        if (((ArrayList) psdVar.d).isEmpty()) {
                            return;
                        }
                        for (zjg zjgVar : (ArrayList) psdVar.d) {
                            ichVar2.v().Z.b(zjgVar.a, "EES logging created event");
                            ich.S(lchVar);
                            hsg hsgVarE1 = lch.E0(zjgVar);
                            ichVar2.U();
                            ichVar2.e(hsgVarE1, ndhVar2);
                        }
                        return;
                    }
                } catch (awg unused2) {
                    ichVar2.v().g.c(ndhVar2.b, str2, "EES error. appId, eventName");
                }
                ichVar2.v().Z.b(str2, "EES was not applied to event");
                ichVar2.U();
                ichVar2.e(hsgVar, ndhVar2);
                return;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ich ichVar3 = ((e5h) this.d).d;
                ichVar3.U();
                ichVar3.c((String) this.c, (hsg) this.b);
                return;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                ich ichVar4 = ((e5h) this.d).d;
                ichVar4.U();
                mch mchVar = (mch) this.b;
                Object objC2 = mchVar.c();
                ndh ndhVar3 = (ndh) this.c;
                if (objC2 == null) {
                    ichVar4.W(mchVar.b, ndhVar3);
                    return;
                } else {
                    ichVar4.V(mchVar, ndhVar3);
                    return;
                }
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                e5h e5hVar = (e5h) this.b;
                ndh ndhVar4 = (ndh) this.c;
                mng mngVar = (mng) this.d;
                ich ichVar5 = e5hVar.d;
                ichVar5.U();
                String str4 = ndhVar4.a;
                oa7.A(str4);
                HashMap map = ichVar5.T0;
                ichVar5.Z().A0();
                ichVar5.m0();
                krg krgVar2 = ichVar5.c;
                ich.S(krgVar2);
                long j2 = mngVar.a;
                long j3 = mngVar.c;
                int i6 = mngVar.b;
                krgVar2.A0();
                krgVar2.B0();
                try {
                    cursorQuery = krgVar2.r1().query("upload_queue", new String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"}, "rowId=?", new String[]{String.valueOf(j2)}, null, null, null, "1");
                    try {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                try {
                                    String string2 = cursorQuery.getString(1);
                                    oa7.A(string2);
                                    try {
                                        kchVar = null;
                                        try {
                                            try {
                                                i2 = i6;
                                                j = j3;
                                                cursor2 = cursorQuery;
                                                try {
                                                    kchVarD1 = krgVar2.d1(string2, j2, cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                                                    cursor2.close();
                                                } catch (SQLiteException e) {
                                                    e = e;
                                                    cursorQuery = cursor2;
                                                    try {
                                                        w0h w0hVar2 = ((w3h) krgVar2.b).f;
                                                        w3h.h(w0hVar2);
                                                        w0hVar2.g.c(Long.valueOf(j2), e, "Error to querying MeasurementBatch from upload_queue. rowId");
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        kchVarD1 = kchVar;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        cursor = cursorQuery;
                                                        if (cursor != null) {
                                                            cursor.close();
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    cursor = cursor2;
                                                    if (cursor != null) {
                                                        cursor.close();
                                                    }
                                                    throw th;
                                                }
                                            } catch (SQLiteException e2) {
                                                e = e2;
                                                cursor2 = cursorQuery;
                                                i2 = i6;
                                                j = j3;
                                            }
                                        } catch (SQLiteException e3) {
                                            e = e3;
                                            cursor2 = cursorQuery;
                                            i2 = i6;
                                            j = j3;
                                            cursorQuery = cursor2;
                                            w0h w0hVar3 = ((w3h) krgVar2.b).f;
                                            w3h.h(w0hVar3);
                                            w0hVar3.g.c(Long.valueOf(j2), e, "Error to querying MeasurementBatch from upload_queue. rowId");
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            kchVarD1 = kchVar;
                                            if (kchVarD1 == null) {
                                                ichVar5.v().x.c(str4, Long.valueOf(j2), "[sgtm] Queued batch doesn't exist. appId, rowId");
                                                return;
                                            }
                                            str = kchVarD1.c;
                                            if (i2 == q8h.SUCCESS.a()) {
                                                if (i2 == q8h.BACKOFF.a()) {
                                                    hchVar = (hch) map.get(str);
                                                    if (hchVar == null) {
                                                        hchVar = new hch(ichVar5);
                                                        map.put(str, hchVar);
                                                    } else {
                                                        hchVar.b++;
                                                        hchVar.c = hchVar.a();
                                                    }
                                                    ichVar5.E().getClass();
                                                    ichVar5.v().Z.d("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str4, str, Long.valueOf((hchVar.c - System.currentTimeMillis()) / 1000));
                                                }
                                                krg krgVar3 = ichVar5.c;
                                                ich.S(krgVar3);
                                                Long lValueOf2 = Long.valueOf(mngVar.a);
                                                krgVar3.M0(lValueOf2);
                                                ichVar5.v().Z.c(str4, lValueOf2, "[sgtm] increased batch retry count after failed client upload. appId, rowId");
                                                return;
                                            }
                                            if (map.containsKey(str)) {
                                                map.remove(str);
                                            }
                                            krg krgVar4 = ichVar5.c;
                                            ich.S(krgVar4);
                                            Long lValueOf3 = Long.valueOf(j2);
                                            krgVar4.H0(lValueOf3);
                                            ichVar5.v().Z.c(str4, lValueOf3, "[sgtm] queued batch deleted after successful client upload. appId, rowId");
                                            if (j > 0) {
                                                krgVar = ichVar5.c;
                                                ich.S(krgVar);
                                                w3h w3hVar = (w3h) krgVar.b;
                                                krgVar.A0();
                                                krgVar.B0();
                                                lValueOf = Long.valueOf(j);
                                                contentValues = new ContentValues();
                                                contentValues.put("upload_type", Integer.valueOf(s8h.GOOGLE_SIGNAL.a()));
                                                hj6 hj6Var = w3hVar.y;
                                                w0hVar = w3hVar.f;
                                                hj6Var.getClass();
                                                contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
                                                try {
                                                    if (krgVar.r1().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j), str4, String.valueOf(s8h.GOOGLE_SIGNAL_PENDING.a())}) != 1) {
                                                        w3h.h(w0hVar);
                                                        w0hVar.x.c(str4, lValueOf, "Google Signal pending batch not updated. appId, rowId");
                                                        break;
                                                    }
                                                    ichVar5.v().Z.c(str4, Long.valueOf(j), "[sgtm] queued Google Signal batch updated. appId, signalRowId");
                                                    ichVar5.o(str4);
                                                    return;
                                                } catch (SQLiteException e4) {
                                                    w3h.h(w0hVar);
                                                    w0hVar.g.d("Failed to update google Signal pending batch. appid, rowId", str4, Long.valueOf(j), e4);
                                                    throw e4;
                                                }
                                            }
                                            return;
                                        }
                                    } catch (SQLiteException e5) {
                                        e = e5;
                                        kchVar = null;
                                    }
                                } catch (SQLiteException e6) {
                                    e = e6;
                                    kchVar = null;
                                    j = j3;
                                    cursor2 = cursorQuery;
                                    i2 = i6;
                                }
                            } else {
                                kchVar = null;
                                i2 = i6;
                                j = j3;
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                kchVarD1 = kchVar;
                            }
                        } catch (SQLiteException e7) {
                            e = e7;
                            kchVar = null;
                            i2 = i6;
                            j = j3;
                            cursor2 = cursorQuery;
                        }
                        if (kchVarD1 == null) {
                            ichVar5.v().x.c(str4, Long.valueOf(j2), "[sgtm] Queued batch doesn't exist. appId, rowId");
                            return;
                        }
                        str = kchVarD1.c;
                        if (i2 == q8h.SUCCESS.a()) {
                            if (i2 == q8h.BACKOFF.a()) {
                                hchVar = (hch) map.get(str);
                                if (hchVar == null) {
                                    hchVar = new hch(ichVar5);
                                    map.put(str, hchVar);
                                } else {
                                    hchVar.b++;
                                    hchVar.c = hchVar.a();
                                }
                                ichVar5.E().getClass();
                                ichVar5.v().Z.d("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str4, str, Long.valueOf((hchVar.c - System.currentTimeMillis()) / 1000));
                            }
                            krg krgVar5 = ichVar5.c;
                            ich.S(krgVar5);
                            Long lValueOf4 = Long.valueOf(mngVar.a);
                            krgVar5.M0(lValueOf4);
                            ichVar5.v().Z.c(str4, lValueOf4, "[sgtm] increased batch retry count after failed client upload. appId, rowId");
                            return;
                        }
                        if (map.containsKey(str)) {
                            map.remove(str);
                        }
                        krg krgVar6 = ichVar5.c;
                        ich.S(krgVar6);
                        Long lValueOf5 = Long.valueOf(j2);
                        krgVar6.H0(lValueOf5);
                        ichVar5.v().Z.c(str4, lValueOf5, "[sgtm] queued batch deleted after successful client upload. appId, rowId");
                        if (j > 0) {
                            krgVar = ichVar5.c;
                            ich.S(krgVar);
                            w3h w3hVar2 = (w3h) krgVar.b;
                            krgVar.A0();
                            krgVar.B0();
                            lValueOf = Long.valueOf(j);
                            contentValues = new ContentValues();
                            contentValues.put("upload_type", Integer.valueOf(s8h.GOOGLE_SIGNAL.a()));
                            hj6 hj6Var2 = w3hVar2.y;
                            w0hVar = w3hVar2.f;
                            hj6Var2.getClass();
                            contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
                            if (krgVar.r1().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j), str4, String.valueOf(s8h.GOOGLE_SIGNAL_PENDING.a())}) != 1) {
                                w3h.h(w0hVar);
                                w0hVar.x.c(str4, lValueOf, "Google Signal pending batch not updated. appId, rowId");
                                break;
                            }
                            ichVar5.v().Z.c(str4, Long.valueOf(j), "[sgtm] queued Google Signal batch updated. appId, signalRowId");
                            ichVar5.o(str4);
                            return;
                        }
                        return;
                    } catch (Throwable th4) {
                        th = th4;
                        cursor2 = cursorQuery;
                    }
                } catch (SQLiteException e8) {
                    e = e8;
                    kchVar = null;
                    i2 = i6;
                    j = j3;
                    cursorQuery = null;
                } catch (Throwable th5) {
                    th = th5;
                    cursor = null;
                }
                break;
            case 14:
                AtomicReference atomicReference2 = (AtomicReference) this.b;
                synchronized (atomicReference2) {
                    try {
                        try {
                            lah lahVar = (lah) this.d;
                            w3h w3hVar3 = (w3h) lahVar.b;
                            c2h c2hVar = w3hVar3.e;
                            w3h.f(c2hVar);
                            if (c2hVar.H0().i(o5h.ANALYTICS_STORAGE)) {
                                hzg hzgVar = lahVar.e;
                                if (hzgVar != null) {
                                    atomicReference2.set(hzgVar.A((ndh) this.c));
                                    String str5 = (String) atomicReference2.get();
                                    if (str5 != null) {
                                        c8h c8hVar = ((w3h) lahVar.b).X;
                                        w3h.g(c8hVar);
                                        c8hVar.v.set(str5);
                                        c2h c2hVar2 = w3hVar3.e;
                                        w3h.f(c2hVar2);
                                        c2hVar2.v.D(str5);
                                    }
                                    lahVar.N0();
                                    atomicReference = (AtomicReference) this.b;
                                    atomicReference.notify();
                                    return;
                                }
                                w0h w0hVar4 = w3hVar3.f;
                                w3h.h(w0hVar4);
                                w0hVar4.g.a("Failed to get app instance id");
                            } else {
                                w0h w0hVar5 = w3hVar3.f;
                                w3h.h(w0hVar5);
                                w0hVar5.z.a("Analytics storage consent denied; will not get app instance id");
                                c8h c8hVar2 = ((w3h) lahVar.b).X;
                                w3h.g(c8hVar2);
                                c8hVar2.v.set(null);
                                c2h c2hVar3 = w3hVar3.e;
                                w3h.f(c2hVar3);
                                c2hVar3.v.D(null);
                                atomicReference2.set(null);
                            }
                            atomicReference2.notify();
                            return;
                        } catch (RemoteException e9) {
                            w0h w0hVar6 = ((w3h) ((lah) this.d).b).f;
                            w3h.h(w0hVar6);
                            w0hVar6.g.b(e9, "Failed to get app instance id");
                            atomicReference = (AtomicReference) this.b;
                        }
                    } catch (Throwable th6) {
                        ((AtomicReference) this.b).notify();
                        throw th6;
                    }
                }
                break;
            case 15:
                tug tugVar = (tug) this.c;
                lah lahVar2 = (lah) this.d;
                w3h w3hVar4 = (w3h) lahVar2.b;
                try {
                    try {
                        c2h c2hVar4 = w3hVar4.e;
                        w0h w0hVar7 = w3hVar4.f;
                        w3h.f(c2hVar4);
                        if (c2hVar4.H0().i(o5h.ANALYTICS_STORAGE)) {
                            hzg hzgVar2 = lahVar2.e;
                            if (hzgVar2 != null) {
                                strA = hzgVar2.A((ndh) this.b);
                                if (strA != null) {
                                    c8h c8hVar3 = w3hVar4.X;
                                    w3h.g(c8hVar3);
                                    c8hVar3.v.set(strA);
                                    w3h.f(c2hVar4);
                                    c2hVar4.v.D(strA);
                                }
                                lahVar2.N0();
                                qchVar = w3hVar4.w;
                                w3h.f(qchVar);
                                qchVar.o1(strA, tugVar);
                                return;
                            }
                            w3h.h(w0hVar7);
                            w0hVar7.g.a("Failed to get app instance id");
                        } else {
                            w3h.h(w0hVar7);
                            w0hVar7.z.a("Analytics storage consent denied; will not get app instance id");
                            c8h c8hVar4 = w3hVar4.X;
                            w3h.g(c8hVar4);
                            c8hVar4.v.set(null);
                            w3h.f(c2hVar4);
                            c2hVar4.v.D(null);
                        }
                        qchVar = w3hVar4.w;
                    } catch (RemoteException e10) {
                        w0h w0hVar8 = w3hVar4.f;
                        w3h.h(w0hVar8);
                        w0hVar8.g.b(e10, "Failed to get app instance id");
                    }
                    w3h.f(qchVar);
                    qchVar.o1(strA, tugVar);
                    return;
                } catch (Throwable th7) {
                    qch qchVar2 = w3hVar4.w;
                    w3h.f(qchVar2);
                    qchVar2.o1(null, tugVar);
                    throw th7;
                }
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                lah lahVar3 = (lah) this.b;
                ndh ndhVar5 = (ndh) this.c;
                mng mngVar2 = (mng) this.d;
                w3h w3hVar5 = (w3h) lahVar3.b;
                hzg hzgVar3 = lahVar3.e;
                if (hzgVar3 == null) {
                    w0h w0hVar9 = w3hVar5.f;
                    w3h.h(w0hVar9);
                    w0hVar9.g.a("[sgtm] Discarding data. Failed to update batch upload status.");
                    return;
                }
                try {
                    hzgVar3.F(ndhVar5, mngVar2);
                    lahVar3.N0();
                    return;
                } catch (RemoteException e11) {
                    w0h w0hVar10 = w3hVar5.f;
                    w3h.h(w0hVar10);
                    w0hVar10.g.c(Long.valueOf(mngVar2.a), e11, "[sgtm] Failed to update batch upload status, rowId, exception");
                    return;
                }
            case 17:
                g5b g5bVar = (g5b) this.b;
                w0h w0hVar11 = (w0h) this.c;
                JobParameters jobParameters = (JobParameters) this.d;
                w0hVar11.Z.a("AppMeasurementJobService processed last upload request.");
                ((rah) ((Service) g5bVar.b)).c(jobParameters);
                return;
            default:
                if (((mmb) this.b).element != null) {
                    r3.f();
                    return;
                }
                weh wehVar = (weh) this.c;
                qu1 qu1Var = (qu1) this.d;
                qfh qfhVarC = dfh.c();
                weh wehVarB = dfh.b(qfhVarC, wehVar);
                try {
                    qu1Var.run();
                    dfh.b(qfhVarC, wehVarB);
                    return;
                } catch (Throwable th8) {
                    try {
                        afh.a(th8);
                        throw th8;
                    } catch (Throwable th9) {
                        dfh.b(qfhVarC, wehVarB);
                        throw th9;
                    }
                }
        }
    }

    public String toString() {
        switch (this.a) {
            case 18:
                qu1 qu1Var = (qu1) this.d;
                StringBuilder sb = new StringBuilder(qu1Var.toString().length() + 14);
                sb.append("propagating=[");
                sb.append(qu1Var);
                sb.append("]");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ qe(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ qe(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public qe(SdkClickHandler sdkClickHandler, String str, String str2) {
        this.a = 4;
        this.d = sdkClickHandler;
        this.c = str;
        this.b = str2;
    }

    public /* synthetic */ qe() {
        this.a = 2;
    }
}
