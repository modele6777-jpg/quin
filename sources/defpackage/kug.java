package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class kug extends jsg implements mug {
    public static mug asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof mug ? (mug) iInterfaceQueryLocalInterface : new iug(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService", 5);
    }

    @Override // defpackage.jsg
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        boolean z = false;
        tug pugVar = null;
        hvg vugVar = null;
        tug pugVar2 = null;
        tug pugVar3 = null;
        tug pugVar4 = null;
        tug pugVar5 = null;
        nvg kvgVar = null;
        nvg kvgVar2 = null;
        nvg kvgVar3 = null;
        tug pugVar6 = null;
        tug pugVar7 = null;
        tug pugVar8 = null;
        tug pugVar9 = null;
        tug pugVar10 = null;
        tug pugVar11 = null;
        dwg ovgVar = null;
        tug pugVar12 = null;
        tug pugVar13 = null;
        tug pugVar14 = null;
        tug pugVar15 = null;
        tug pugVar16 = null;
        switch (i) {
            case 1:
                vt6 vt6VarM = tk9.M(parcel.readStrongBinder());
                gwg gwgVar = (gwg) lsg.a(parcel, gwg.CREATOR);
                long j = parcel.readLong();
                lsg.d(parcel);
                initialize(vt6VarM, gwgVar, j);
                break;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) lsg.a(parcel, Bundle.CREATOR);
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                long j2 = parcel.readLong();
                lsg.d(parcel);
                logEvent(string, string2, bundle, z2, z3, j2);
                break;
            case 3:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Bundle bundle2 = (Bundle) lsg.a(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    pugVar = iInterfaceQueryLocalInterface instanceof tug ? (tug) iInterfaceQueryLocalInterface : new pug(strongBinder);
                }
                tug tugVar = pugVar;
                long j3 = parcel.readLong();
                lsg.d(parcel);
                logEventAndBundle(string3, string4, bundle2, tugVar, j3);
                break;
            case 4:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                vt6 vt6VarM2 = tk9.M(parcel.readStrongBinder());
                ClassLoader classLoader = lsg.a;
                boolean z4 = parcel.readInt() != 0;
                long j4 = parcel.readLong();
                lsg.d(parcel);
                setUserProperty(string5, string6, vt6VarM2, z4, j4);
                break;
            case 5:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                ClassLoader classLoader2 = lsg.a;
                boolean z5 = parcel.readInt() != 0;
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    pugVar16 = iInterfaceQueryLocalInterface2 instanceof tug ? (tug) iInterfaceQueryLocalInterface2 : new pug(strongBinder2);
                }
                lsg.d(parcel);
                getUserProperties(string7, string8, z5, pugVar16);
                break;
            case 6:
                String string9 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    pugVar15 = iInterfaceQueryLocalInterface3 instanceof tug ? (tug) iInterfaceQueryLocalInterface3 : new pug(strongBinder3);
                }
                lsg.d(parcel);
                getMaxUserProperties(string9, pugVar15);
                break;
            case 7:
                String string10 = parcel.readString();
                long j5 = parcel.readLong();
                lsg.d(parcel);
                setUserId(string10, j5);
                break;
            case 8:
                Bundle bundle3 = (Bundle) lsg.a(parcel, Bundle.CREATOR);
                long j6 = parcel.readLong();
                lsg.d(parcel);
                setConditionalUserProperty(bundle3, j6);
                break;
            case 9:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Bundle bundle4 = (Bundle) lsg.a(parcel, Bundle.CREATOR);
                lsg.d(parcel);
                clearConditionalUserProperty(string11, string12, bundle4);
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    pugVar14 = iInterfaceQueryLocalInterface4 instanceof tug ? (tug) iInterfaceQueryLocalInterface4 : new pug(strongBinder4);
                }
                lsg.d(parcel);
                getConditionalUserProperties(string13, string14, pugVar14);
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ClassLoader classLoader3 = lsg.a;
                boolean z6 = parcel.readInt() != 0;
                long j7 = parcel.readLong();
                lsg.d(parcel);
                setMeasurementEnabled(z6, j7);
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                long j8 = parcel.readLong();
                lsg.d(parcel);
                resetAnalyticsData(j8);
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                long j9 = parcel.readLong();
                lsg.d(parcel);
                setMinimumSessionDuration(j9);
                break;
            case 14:
                long j10 = parcel.readLong();
                lsg.d(parcel);
                setSessionTimeoutDuration(j10);
                break;
            case 15:
                vt6 vt6VarM3 = tk9.M(parcel.readStrongBinder());
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                long j11 = parcel.readLong();
                lsg.d(parcel);
                setCurrentScreen(vt6VarM3, string15, string16, j11);
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    pugVar13 = iInterfaceQueryLocalInterface5 instanceof tug ? (tug) iInterfaceQueryLocalInterface5 : new pug(strongBinder5);
                }
                lsg.d(parcel);
                getCurrentScreenName(pugVar13);
                break;
            case 17:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    pugVar12 = iInterfaceQueryLocalInterface6 instanceof tug ? (tug) iInterfaceQueryLocalInterface6 : new pug(strongBinder6);
                }
                lsg.d(parcel);
                getCurrentScreenClass(pugVar12);
                break;
            case 18:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    ovgVar = iInterfaceQueryLocalInterface7 instanceof dwg ? (dwg) iInterfaceQueryLocalInterface7 : new ovg(strongBinder7, "com.google.android.gms.measurement.api.internal.IStringProvider", 5);
                }
                lsg.d(parcel);
                setInstanceIdProvider(ovgVar);
                break;
            case 19:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    pugVar11 = iInterfaceQueryLocalInterface8 instanceof tug ? (tug) iInterfaceQueryLocalInterface8 : new pug(strongBinder8);
                }
                lsg.d(parcel);
                getCachedAppInstanceId(pugVar11);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    pugVar10 = iInterfaceQueryLocalInterface9 instanceof tug ? (tug) iInterfaceQueryLocalInterface9 : new pug(strongBinder9);
                }
                lsg.d(parcel);
                getAppInstanceId(pugVar10);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    pugVar9 = iInterfaceQueryLocalInterface10 instanceof tug ? (tug) iInterfaceQueryLocalInterface10 : new pug(strongBinder10);
                }
                lsg.d(parcel);
                getGmpAppId(pugVar9);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    pugVar8 = iInterfaceQueryLocalInterface11 instanceof tug ? (tug) iInterfaceQueryLocalInterface11 : new pug(strongBinder11);
                }
                lsg.d(parcel);
                generateEventId(pugVar8);
                break;
            case 23:
                String string17 = parcel.readString();
                long j12 = parcel.readLong();
                lsg.d(parcel);
                beginAdUnitExposure(string17, j12);
                break;
            case 24:
                String string18 = parcel.readString();
                long j13 = parcel.readLong();
                lsg.d(parcel);
                endAdUnitExposure(string18, j13);
                break;
            case 25:
                vt6 vt6VarM4 = tk9.M(parcel.readStrongBinder());
                long j14 = parcel.readLong();
                lsg.d(parcel);
                onActivityStarted(vt6VarM4, j14);
                break;
            case 26:
                vt6 vt6VarM5 = tk9.M(parcel.readStrongBinder());
                long j15 = parcel.readLong();
                lsg.d(parcel);
                onActivityStopped(vt6VarM5, j15);
                break;
            case 27:
                vt6 vt6VarM6 = tk9.M(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) lsg.a(parcel, Bundle.CREATOR);
                long j16 = parcel.readLong();
                lsg.d(parcel);
                onActivityCreated(vt6VarM6, bundle5, j16);
                break;
            case 28:
                vt6 vt6VarM7 = tk9.M(parcel.readStrongBinder());
                long j17 = parcel.readLong();
                lsg.d(parcel);
                onActivityDestroyed(vt6VarM7, j17);
                break;
            case 29:
                vt6 vt6VarM8 = tk9.M(parcel.readStrongBinder());
                long j18 = parcel.readLong();
                lsg.d(parcel);
                onActivityPaused(vt6VarM8, j18);
                break;
            case 30:
                vt6 vt6VarM9 = tk9.M(parcel.readStrongBinder());
                long j19 = parcel.readLong();
                lsg.d(parcel);
                onActivityResumed(vt6VarM9, j19);
                break;
            case 31:
                vt6 vt6VarM10 = tk9.M(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    pugVar7 = iInterfaceQueryLocalInterface12 instanceof tug ? (tug) iInterfaceQueryLocalInterface12 : new pug(strongBinder12);
                }
                long j20 = parcel.readLong();
                lsg.d(parcel);
                onActivitySaveInstanceState(vt6VarM10, pugVar7, j20);
                break;
            case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
                Bundle bundle6 = (Bundle) lsg.a(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    pugVar6 = iInterfaceQueryLocalInterface13 instanceof tug ? (tug) iInterfaceQueryLocalInterface13 : new pug(strongBinder13);
                }
                long j21 = parcel.readLong();
                lsg.d(parcel);
                performAction(bundle6, pugVar6, j21);
                break;
            case 33:
                int i2 = parcel.readInt();
                String string19 = parcel.readString();
                vt6 vt6VarM11 = tk9.M(parcel.readStrongBinder());
                vt6 vt6VarM12 = tk9.M(parcel.readStrongBinder());
                vt6 vt6VarM13 = tk9.M(parcel.readStrongBinder());
                lsg.d(parcel);
                logHealthData(i2, string19, vt6VarM11, vt6VarM12, vt6VarM13);
                break;
            case 34:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    kvgVar3 = iInterfaceQueryLocalInterface14 instanceof nvg ? (nvg) iInterfaceQueryLocalInterface14 : new kvg(strongBinder14);
                }
                lsg.d(parcel);
                setEventInterceptor(kvgVar3);
                break;
            case 35:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    kvgVar2 = iInterfaceQueryLocalInterface15 instanceof nvg ? (nvg) iInterfaceQueryLocalInterface15 : new kvg(strongBinder15);
                }
                lsg.d(parcel);
                registerOnMeasurementEventListener(kvgVar2);
                break;
            case 36:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    kvgVar = iInterfaceQueryLocalInterface16 instanceof nvg ? (nvg) iInterfaceQueryLocalInterface16 : new kvg(strongBinder16);
                }
                lsg.d(parcel);
                unregisterOnMeasurementEventListener(kvgVar);
                break;
            case 37:
                HashMap hashMap = parcel.readHashMap(lsg.a);
                lsg.d(parcel);
                initForTests(hashMap);
                break;
            case 38:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    pugVar5 = iInterfaceQueryLocalInterface17 instanceof tug ? (tug) iInterfaceQueryLocalInterface17 : new pug(strongBinder17);
                }
                int i3 = parcel.readInt();
                lsg.d(parcel);
                getTestFlag(pugVar5, i3);
                break;
            case 39:
                ClassLoader classLoader4 = lsg.a;
                boolean z7 = parcel.readInt() != 0;
                lsg.d(parcel);
                setDataCollectionEnabled(z7);
                break;
            case 40:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    pugVar4 = iInterfaceQueryLocalInterface18 instanceof tug ? (tug) iInterfaceQueryLocalInterface18 : new pug(strongBinder18);
                }
                lsg.d(parcel);
                isDataCollectionEnabled(pugVar4);
                break;
            case 41:
            case 47:
            case 49:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) lsg.a(parcel, Bundle.CREATOR);
                lsg.d(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long j22 = parcel.readLong();
                lsg.d(parcel);
                clearMeasurementEnabled(j22);
                break;
            case 44:
                Bundle bundle8 = (Bundle) lsg.a(parcel, Bundle.CREATOR);
                long j23 = parcel.readLong();
                lsg.d(parcel);
                setConsent(bundle8, j23);
                break;
            case 45:
                Bundle bundle9 = (Bundle) lsg.a(parcel, Bundle.CREATOR);
                long j24 = parcel.readLong();
                lsg.d(parcel);
                setConsentThirdParty(bundle9, j24);
                break;
            case 46:
                IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 != null) {
                    IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    pugVar3 = iInterfaceQueryLocalInterface19 instanceof tug ? (tug) iInterfaceQueryLocalInterface19 : new pug(strongBinder19);
                }
                lsg.d(parcel);
                getSessionId(pugVar3);
                break;
            case z7c.f /* 48 */:
                Intent intent = (Intent) lsg.a(parcel, Intent.CREATOR);
                lsg.d(parcel);
                setSgtmDebugInfo(intent);
                break;
            case 50:
                iwg iwgVar = (iwg) lsg.a(parcel, iwg.CREATOR);
                String string20 = parcel.readString();
                String string21 = parcel.readString();
                long j25 = parcel.readLong();
                lsg.d(parcel);
                setCurrentScreenByScionActivityInfo(iwgVar, string20, string21, j25);
                break;
            case 51:
                iwg iwgVar2 = (iwg) lsg.a(parcel, iwg.CREATOR);
                long j26 = parcel.readLong();
                lsg.d(parcel);
                onActivityStartedByScionActivityInfo(iwgVar2, j26);
                break;
            case 52:
                iwg iwgVar3 = (iwg) lsg.a(parcel, iwg.CREATOR);
                long j27 = parcel.readLong();
                lsg.d(parcel);
                onActivityStoppedByScionActivityInfo(iwgVar3, j27);
                break;
            case 53:
                iwg iwgVar4 = (iwg) lsg.a(parcel, iwg.CREATOR);
                Bundle bundle10 = (Bundle) lsg.a(parcel, Bundle.CREATOR);
                long j28 = parcel.readLong();
                lsg.d(parcel);
                onActivityCreatedByScionActivityInfo(iwgVar4, bundle10, j28);
                break;
            case 54:
                iwg iwgVar5 = (iwg) lsg.a(parcel, iwg.CREATOR);
                long j29 = parcel.readLong();
                lsg.d(parcel);
                onActivityDestroyedByScionActivityInfo(iwgVar5, j29);
                break;
            case 55:
                iwg iwgVar6 = (iwg) lsg.a(parcel, iwg.CREATOR);
                long j30 = parcel.readLong();
                lsg.d(parcel);
                onActivityPausedByScionActivityInfo(iwgVar6, j30);
                break;
            case 56:
                iwg iwgVar7 = (iwg) lsg.a(parcel, iwg.CREATOR);
                long j31 = parcel.readLong();
                lsg.d(parcel);
                onActivityResumedByScionActivityInfo(iwgVar7, j31);
                break;
            case 57:
                iwg iwgVar8 = (iwg) lsg.a(parcel, iwg.CREATOR);
                IBinder strongBinder20 = parcel.readStrongBinder();
                if (strongBinder20 != null) {
                    IInterface iInterfaceQueryLocalInterface20 = strongBinder20.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    pugVar2 = iInterfaceQueryLocalInterface20 instanceof tug ? (tug) iInterfaceQueryLocalInterface20 : new pug(strongBinder20);
                }
                long j32 = parcel.readLong();
                lsg.d(parcel);
                onActivitySaveInstanceStateByScionActivityInfo(iwgVar8, pugVar2, j32);
                break;
            case 58:
                IBinder strongBinder21 = parcel.readStrongBinder();
                if (strongBinder21 != null) {
                    IInterface iInterfaceQueryLocalInterface21 = strongBinder21.queryLocalInterface("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                    vugVar = iInterfaceQueryLocalInterface21 instanceof hvg ? (hvg) iInterfaceQueryLocalInterface21 : new vug(strongBinder21, "com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback", 5);
                }
                lsg.d(parcel);
                retrieveAndUploadBatches(vugVar);
                break;
            case 59:
                String string22 = parcel.readString();
                String string23 = parcel.readString();
                Bundle bundle11 = (Bundle) lsg.a(parcel, Bundle.CREATOR);
                if (parcel.readInt() != 0) {
                    z = true;
                }
                boolean z8 = parcel.readInt() != 0;
                long j33 = parcel.readLong();
                long j34 = parcel.readLong();
                lsg.d(parcel);
                logEventWithElapsedTime(string22, string23, bundle11, z, z8, j33, j34);
                break;
            case 60:
                vt6 vt6VarM14 = tk9.M(parcel.readStrongBinder());
                gwg gwgVar2 = (gwg) lsg.a(parcel, gwg.CREATOR);
                long j35 = parcel.readLong();
                long j36 = parcel.readLong();
                lsg.d(parcel);
                initializeWithElapsedTime(vt6VarM14, gwgVar2, j35, j36);
                break;
            case 61:
                long j37 = parcel.readLong();
                long j38 = parcel.readLong();
                lsg.d(parcel);
                resetAnalyticsDataWithElapsedTime(j37, j38);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
