/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 Suguru Yajima
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.zabbix4j.itservice;

import com.zabbix4j.ZabbixApiResponse;
import com.zabbix4j.trigger.TriggerObject;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class ITServiceGetResponse extends ZabbixApiResponse {

    private List<Result> result;

    public ITServiceGetResponse() {
        super();
    }

    /**
     * Gets result.
     *
     * @return Value of result.
     */
    public List<Result> getResult() {
        return result;
    }

    /**
     * Sets new result.
     *
     * @param result New value of result.
     */
    public void setResult(List<Result> result) {
        this.result = result;
    }

    public class Result extends ITServiceObject {

        private List<ServiceDependencyObject> dependencies;
        private List<ServiceDependencyObject> parentDependencies;
        private ITServiceObject parent;
        private List<ServiceTimeObject> times;
        private List<ServiceAlarmObject> alarms;
        private TriggerObject trigger;

        /**
         * Gets dependencies.
         *
         * @return Value of dependencies.
         */
        public List<ServiceDependencyObject> getDependencies() {
            return dependencies;
        }

        /**
         * Sets new dependencies.
         *
         * @param dependencies New value of dependencies.
         */
        public void setDependencies(List<ServiceDependencyObject> dependencies) {
            this.dependencies = dependencies;
        }

        /**
         * Gets parentDependencies.
         *
         * @return Value of parentDependencies.
         */
        public List<ServiceDependencyObject> getParentDependencies() {
            return parentDependencies;
        }

        /**
         * Sets new parentDependencies.
         *
         * @param parentDependencies New value of parentDependencies.
         */
        public void setParentDependencies(List<ServiceDependencyObject> parentDependencies) {
            this.parentDependencies = parentDependencies;
        }

        /**
         * Gets alarms.
         *
         * @return Value of alarms.
         */
        public List<ServiceAlarmObject> getAlarms() {
            return alarms;
        }

        /**
         * Sets new alarms.
         *
         * @param alarms New value of alarms.
         */
        public void setAlarms(List<ServiceAlarmObject> alarms) {
            this.alarms = alarms;
        }

        /**
         * Gets times.
         *
         * @return Value of times.
         */
        public List<ServiceTimeObject> getTimes() {
            return times;
        }

        /**
         * Sets new times.
         *
         * @param times New value of times.
         */
        public void setTimes(List<ServiceTimeObject> times) {
            this.times = times;
        }

        /**
         * Gets parent.
         *
         * @return Value of parent.
         */
        public ITServiceObject getParent() {
            return parent;
        }

        /**
         * Sets new parent.
         *
         * @param parent New value of parent.
         */
        public void setParent(ITServiceObject parent) {
            this.parent = parent;
        }

        /**
         * Gets trigger.
         *
         * @return Value of trigger.
         */
        public TriggerObject getTrigger() {
            return trigger;
        }

        /**
         * Sets new trigger.
         *
         * @param trigger New value of trigger.
         */
        public void setTrigger(TriggerObject trigger) {
            this.trigger = trigger;
        }
    }
}
