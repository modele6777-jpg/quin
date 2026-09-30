package androidx.startup;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Trace;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.ta0;
import defpackage.xdc;
import defpackage.zzd;
import io.sentry.android.core.performance.g;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class InitializationProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        g.e(this);
        Context context = getContext();
        if (context == null) {
            zzd zzdVar = new zzd("Context cannot be null");
            g.f(this);
            throw zzdVar;
        }
        if (context.getApplicationContext() != null) {
            ta0 ta0VarV = ta0.v(context);
            Class<?> cls = getClass();
            Context context2 = (Context) ta0VarV.b;
            try {
                try {
                    Trace.beginSection(xdc.v("Startup"));
                    ta0VarV.m(context2.getPackageManager().getProviderInfo(new ComponentName(context2, cls), UserMetadata.MAX_ROLLOUT_ASSIGNMENTS).metaData);
                    Trace.endSection();
                } catch (PackageManager.NameNotFoundException e) {
                    throw new zzd(e);
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        g.f(this);
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}
