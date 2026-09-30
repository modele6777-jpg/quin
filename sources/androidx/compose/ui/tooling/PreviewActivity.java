package androidx.compose.ui.tooling;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import defpackage.dd2;
import defpackage.m65;
import defpackage.qc0;
import defpackage.qt7;
import defpackage.tec;
import defpackage.uz5;
import defpackage.v4e;
import defpackage.vb2;
import defpackage.wb2;
import io.sentry.android.core.b1;
import java.lang.reflect.Constructor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class PreviewActivity extends vb2 {
    public static final /* synthetic */ int L0 = 0;
    public final String K0 = "PreviewActivity";

    @Override // defpackage.vb2, defpackage.ub2, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        Class<?> cls;
        super.onCreate(bundle);
        int i = getApplicationInfo().flags & 2;
        String str = this.K0;
        if (i == 0) {
            Log.d(str, "Application is not debuggable. Compose Preview not allowed.");
            finish();
            return;
        }
        Intent intent = getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra("composable")) == null) {
            return;
        }
        Log.d(str, "PreviewActivity has composable ".concat(stringExtra));
        String strK0 = v4e.k0(stringExtra, '.');
        String strG0 = v4e.g0('.', stringExtra, stringExtra);
        String stringExtra2 = getIntent().getStringExtra("parameterProviderClassName");
        if (stringExtra2 == null) {
            Log.d(str, "Previewing '" + strG0 + "' without a parameter provider.");
            wb2.a(this, new dd2(new uz5(strK0, strG0, 1), true, -840626948));
            return;
        }
        Log.d(str, tec.m("Previewing '", strG0, "' with parameter provider: '", stringExtra2, "'"));
        try {
            cls = Class.forName(stringExtra2);
        } catch (ClassNotFoundException e) {
            b1.e("PreviewLogger", "Unable to find PreviewProvider '" + stringExtra2 + "'", e);
            cls = null;
        }
        getIntent().getIntExtra("parameterProviderIndex", -1);
        int i2 = 0;
        if (cls == null) {
            wb2.a(this, new dd2(new m65(strK0, strG0, new Object[0], 26), true, -1901447514));
            return;
        }
        try {
            Constructor<?>[] constructors = cls.getConstructors();
            int length = constructors.length;
            Constructor<?> constructor = null;
            boolean z = false;
            while (true) {
                if (i2 >= length) {
                    if (z) {
                        break;
                    }
                } else {
                    Constructor<?> constructor2 = constructors[i2];
                    if (constructor2.getParameterTypes().length == 0) {
                        if (!z) {
                            z = true;
                            constructor = constructor2;
                        }
                    }
                    i2++;
                }
                constructor = null;
                break;
            }
            if (constructor == null) {
                throw new IllegalArgumentException("PreviewParameterProvider constructor can not have parameters");
            }
            constructor.setAccessible(true);
            constructor.newInstance(null).getClass();
            throw new ClassCastException();
        } catch (qt7 unused) {
            qc0.p("Deploying Compose Previews with PreviewParameterProvider arguments requires adding a dependency to the kotlin-reflect library.\nConsider adding 'debugImplementation \"org.jetbrains.kotlin:kotlin-reflect:$kotlin_version\"' to the module's build.gradle.");
        }
    }
}
