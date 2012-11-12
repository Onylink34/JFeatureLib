package de.lmu.ifi.dbs.jfeaturelib.features;

import de.lmu.ifi.dbs.jfeaturelib.Descriptor.Supports;
import de.lmu.ifi.dbs.jfeaturelib.Progress;
import ij.process.ImageProcessor;
import ij.process.ImageStatistics;
import java.util.EnumSet;

/**
 * Calculates the basic statistical moments of an image like mean, std_dev,
 * skewness and kurtosis.
 *
 * @author graf
 * @since 11/4/2011
 */
public class Moments extends AbstractFeatureDescriptor {

    @Override
    public void run(ImageProcessor ip) {
        int STATS = ImageStatistics.MEAN
                + ImageStatistics.STD_DEV
                + ImageStatistics.SKEWNESS
                + ImageStatistics.KURTOSIS;
        
        firePropertyChange(Progress.START);
        ImageStatistics stat = ImageStatistics.getStatistics(ip, STATS, null);
        addData(new double[]{stat.mean, stat.stdDev, stat.skewness, stat.kurtosis});
        firePropertyChange(Progress.END);
    }

    @Override
    public EnumSet<Supports> supports() {
        return DOES_ALL;
    }

    @Override
    public String getDescription() {
        return "First 4 Statistical Moments (Mean, StdDev, Skewness, kurtosis)";
    }
}