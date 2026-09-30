package defpackage;

import java.util.Locale;
import java.util.ResourceBundle;
import org.ocpsoft.prettytime.impl.ResourcesTimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class iyb extends sjd {
    public final ResourcesTimeUnit a;
    public uxe b;

    public iyb(ResourcesTimeUnit resourcesTimeUnit) {
        this.a = resourcesTimeUnit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(Locale locale) {
        ResourceBundle bundle = ResourceBundle.getBundle("org.ocpsoft.prettytime.i18n.Resources", locale);
        boolean z = bundle instanceof vxe;
        ResourcesTimeUnit resourcesTimeUnit = this.a;
        if (z) {
            uxe formatFor = ((vxe) bundle).getFormatFor(resourcesTimeUnit);
            if (formatFor != null) {
                this.b = formatFor;
            }
        } else {
            this.b = null;
        }
        if (this.b == null) {
            setPattern(bundle.getString(resourcesTimeUnit.a().concat("Pattern")));
            setFuturePrefix(bundle.getString(resourcesTimeUnit.a().concat("FuturePrefix")));
            setFutureSuffix(bundle.getString(resourcesTimeUnit.a().concat("FutureSuffix")));
            setPastPrefix(bundle.getString(resourcesTimeUnit.a().concat("PastPrefix")));
            setPastSuffix(bundle.getString(resourcesTimeUnit.a().concat("PastSuffix")));
            setSingularName(bundle.getString(resourcesTimeUnit.a().concat("SingularName")));
            setPluralName(bundle.getString(resourcesTimeUnit.a().concat("PluralName")));
            try {
                setFuturePluralName(bundle.getString(resourcesTimeUnit.a().concat("FuturePluralName")));
            } catch (Exception unused) {
            }
            try {
                setFutureSingularName(bundle.getString(resourcesTimeUnit.a().concat("FutureSingularName")));
            } catch (Exception unused2) {
            }
            try {
                setPastPluralName(bundle.getString(resourcesTimeUnit.a().concat("PastPluralName")));
            } catch (Exception unused3) {
            }
            try {
                setPastSingularName(bundle.getString(resourcesTimeUnit.a().concat("PastSingularName")));
            } catch (Exception unused4) {
            }
        }
    }

    @Override // defpackage.sjd, defpackage.uxe
    public final String decorate(zq4 zq4Var, String str) {
        uxe uxeVar = this.b;
        return uxeVar == null ? super.decorate(zq4Var, str) : uxeVar.decorate(zq4Var, str);
    }

    @Override // defpackage.sjd, defpackage.uxe
    public final String decorateUnrounded(zq4 zq4Var, String str) {
        uxe uxeVar = this.b;
        return uxeVar == null ? super.decorateUnrounded(zq4Var, str) : uxeVar.decorateUnrounded(zq4Var, str);
    }

    @Override // defpackage.sjd, defpackage.uxe
    public final String format(zq4 zq4Var) {
        uxe uxeVar = this.b;
        return uxeVar == null ? super.format(zq4Var) : uxeVar.format(zq4Var);
    }

    @Override // defpackage.sjd, defpackage.uxe
    public final String formatUnrounded(zq4 zq4Var) {
        uxe uxeVar = this.b;
        return uxeVar == null ? super.formatUnrounded(zq4Var) : uxeVar.formatUnrounded(zq4Var);
    }

    @Override // defpackage.sjd
    /* JADX INFO: renamed from: setLocale, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ sjd mo31setLocale(Locale locale) {
        b(locale);
        return this;
    }

    @Override // defpackage.sjd
    public final /* bridge */ /* synthetic */ Object setLocale(Locale locale) {
        b(locale);
        return this;
    }
}
